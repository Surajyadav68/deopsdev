package com.suninfotech.admin.serviceImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.suninfotech.admin.dto.AccountsMasterDTO;
import com.suninfotech.admin.entity.AccountsMaster;
import com.suninfotech.admin.exception.Response;
import com.suninfotech.admin.repository.AccountsMasterRepository;
import com.suninfotech.admin.service.AccountsMasterService;

@Service
@Repository
public class AccountsMasterServiceImpl implements AccountsMasterService {
	@Autowired
	AccountsMasterRepository accountsMasterRepository;

	@Override
	public ResponseEntity<Response<Void>> crateAccountMaster(AccountsMasterDTO accountsMasterDTO) {
		Response<Void> response = new Response<>();
		try {
			AccountsMaster accountsMaster = new AccountsMaster();
			accountsMaster = AccountsMasterDTO.convertToEntity(accountsMasterDTO);
			accountsMasterRepository.save(accountsMaster);

			response.setResponseCode(HttpStatus.OK.value());
			response.setMessage("SUCCESSFULLY_SAVE");
			return new ResponseEntity<>(response, HttpStatus.OK);

		} catch (Exception e) {
			response.setResponseCode(HttpStatus.INTERNAL_SERVER_ERROR.value());
			response.setMessage(e.getMessage());
			return new ResponseEntity<>(response, HttpStatus.OK);
		}
	}

	@Override
	public ResponseEntity<Response<Void>> updateAccountMaster(AccountsMasterDTO accountsMasterDTO) {

		Response<Void> response = new Response<>();
		try {
			AccountsMaster accountsMaster = new AccountsMaster();
			accountsMaster = AccountsMasterDTO.convertToEntity(accountsMasterDTO);
			accountsMasterRepository.save(accountsMaster);

			response.setResponseCode(HttpStatus.OK.value());
			response.setMessage("updated is updated successfully");
			return new ResponseEntity<>(response, HttpStatus.OK);
		} catch (Exception e) {

			response.setResponseCode(HttpStatus.INTERNAL_SERVER_ERROR.value());
			response.setMessage(e.getMessage());
			return new ResponseEntity<>(response, HttpStatus.OK);
		}
	}

	@Override
	public ResponseEntity<Response<List<AccountsMasterDTO>>> getAllTheAccountMaster() {
		Response<List<AccountsMasterDTO>> response = new Response<>();
		try {
			List<AccountsMasterDTO> accountMasterDTOList = new ArrayList<>();
			List<AccountsMaster> accountMasterList = accountsMasterRepository.findAll();
			if (accountMasterList.isEmpty()) {
				response.setResponseCode(HttpStatus.NO_CONTENT.value());
				response.setMessage("No accountsMaster found.");
				return new ResponseEntity<>(response, HttpStatus.OK);
			} else {
				accountMasterList.forEach(address -> {
					AccountsMasterDTO dto = AccountsMaster.convertToDto(address);
					accountMasterDTOList.add(dto);
				});
			}
			response.setResponseCode(HttpStatus.OK.value());
			response.setMessage("SUCCESS");
			response.setData(accountMasterDTOList);
			return new ResponseEntity<>(response, HttpStatus.OK);
		} catch (Exception e) {

			response.setResponseCode(HttpStatus.INTERNAL_SERVER_ERROR.value());
			response.setMessage(e.getMessage());
			return new ResponseEntity<>(response, HttpStatus.OK);
		}
	}
	
	@Override
	public ResponseEntity<Response<AccountsMasterDTO>> getAccountMasterById(int id) {
		Response<AccountsMasterDTO> response = new Response<>();
		try {
			if (id == 0) {
				response.setResponseCode(HttpStatus.BAD_REQUEST.value());
				response.setMessage("please enter account Id");
				return new ResponseEntity<>(response, HttpStatus.OK);
			} else {
				AccountsMasterDTO addressDTO = new AccountsMasterDTO();
				Optional<AccountsMaster> optionalAddress = accountsMasterRepository.findById(id);
				if (optionalAddress.isPresent()) {
					AccountsMaster address = optionalAddress.get();
					 AccountsMaster.convertToDto(address);
					

				} else {
					response.setResponseCode(HttpStatus.NO_CONTENT.value());
					response.setMessage("this address is not present in database");
					return new ResponseEntity<>(response, HttpStatus.OK);
				}
				// return ResponseEntity.of(Optional.of(customerDTO));
				response.setResponseCode(HttpStatus.OK.value());
				response.setMessage("SUCCESS");
				response.setData(addressDTO);
				return new ResponseEntity<>(response, HttpStatus.OK);
			}

		} catch (Exception e) {

			response.setResponseCode(HttpStatus.INTERNAL_SERVER_ERROR.value());
			response.setMessage(e.getMessage());
			return new ResponseEntity<>(response, HttpStatus.OK);
		}
	}
	

}
