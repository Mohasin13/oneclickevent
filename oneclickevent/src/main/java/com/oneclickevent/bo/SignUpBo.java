package com.oneclickevent.bo;

import com.oneclickevent.model.UserSignupModel;

public interface SignUpBo {

	void save(UserSignupModel signup);
	void update(UserSignupModel signup);
	void delete(UserSignupModel signup);
	UserSignupModel findBySignupModel(int mobile);
	
}
