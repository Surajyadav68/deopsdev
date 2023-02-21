package com.suninfotech.admin.service;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.suninfotech.admin.dto.AccountsMasterDTO;
import com.suninfotech.admin.exception.Response;

public interface AccountsMasterService {

	ResponseEntity<Response<Void>> crateAccountMaster(AccountsMasterDTO accountsMasterDTO);
	
	ResponseEntity<Response<Void>> updateAccountMaster(AccountsMasterDTO accountsMasterDTO);
	
	public ResponseEntity<Response<List<AccountsMasterDTO>>> getAllTheAccountMaster();
	
	public ResponseEntity<Response<AccountsMasterDTO>> getAccountMasterById(int id);
	
}