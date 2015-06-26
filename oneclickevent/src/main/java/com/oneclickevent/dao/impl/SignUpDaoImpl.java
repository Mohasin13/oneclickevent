package com.oneclickevent.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;
 
import com.oneclickevent.dao.SignUpDao;
import com.oneclickevent.model.UserSignupModel;
import com.oneclickevent.dao.support.CustomHibernateDaoSupport;

@Repository("SignUpDao")
public class SignUpDaoImpl extends CustomHibernateDaoSupport implements SignUpDao {
	
	
	public void save(UserSignupModel signup)
	{
		getHibernateTemplate().save(signup);
	}
	
	public void update(UserSignupModel signup)
	{
		getHibernateTemplate().update(signup);
	}
	
	public void delete(UserSignupModel signup)
	{
		getHibernateTemplate().delete(signup);
	}
	public UserSignupModel findBySignupModel(int mobile)
	{
		List list = getHibernateTemplate().find("from UserSignupModel where mobile = ?" , mobile);
	    return (UserSignupModel)list.get(0);
	}

}
