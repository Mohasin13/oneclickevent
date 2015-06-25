package com.oneclickevent.dao;

import com.oneclickevent.model.UserSignupModel;

public interface SignUpDao {

	void save(UserSignupModel signup);
	void update(UserSignupModel signup);
	void delete(UserSignupModel signup);
	UserSignupModel findBySignupModel(int mobile);
	
}
