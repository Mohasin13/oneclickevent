package com.oneclickevent.bo.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
 
import com.oneclickevent.bo.SignUpBo;
import com.oneclickevent.dao.SignUpDao;
import com.oneclickevent.model.UserSignupModel;

@Service("signUpBo")
public class SignUpBoImpl implements SignUpBo {

	@Autowired
	 SignUpDao signupDao;
 
	public void setStockDao(SignUpDao signupDao) {
		this.signupDao = signupDao;
	}
 
	public void save(UserSignupModel signup){
		signupDao.save(signup);
	}
 
	public void update(UserSignupModel signup){
		signupDao.update(signup);
	}
 
	public void delete(UserSignupModel signup){
		signupDao.delete(signup);
	}
 
	public UserSignupModel findBySignupModel(int mobile){
		
		return signupDao.findBySignupModel(mobile);
	
	}
	
}
