package com.codingdojo.subs.validator;

import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.validation.ConstraintViolation;
import javax.validation.Validator;
import javax.validation.executable.ExecutableValidator;
import javax.validation.metadata.BeanDescriptor;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;

import com.codingdojo.subs.models.User;

@Component
public class UserValidator implements Validator{
	private static final String email_regex = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
	private Pattern pattern;
	private Matcher matcher;
    // Need to match email regex
	
	public UserValidator() {
		this.pattern = Pattern.compile(email_regex);
	}
	// Makes the pattern the email regex in the constructor
	
	public boolean supports(Class<?> clazz) {
        return User.class.equals(clazz);
    }
    // Specifies that a instance of the User Domain Model 
    // can be validated with this custom validator
	
	public boolean validateEmail(String email) {
		this.matcher = this.pattern.matcher(email);
		return matcher.matches();
	}
	// Checks if the email is an email and returns a boolean
    
    public void validate(Object object, Errors errors) {
        User user = (User) object;
        
        if (!user.getPasswordConfirmation().equals(user.getPassword())) {
            errors.rejectValue("passwordConfirmation", "Match");
        } else if(!validateEmail(user.getEmail())){
			errors.rejectValue("email","Match");
		}    
    }
    // Checks if the password matches and if email is an email
    // Creating our custom validation. We can add errors 
    // via .rejectValue(String, String)
    // In our if statement, the first argument is the member variable 
    // of our Domain model that we are validating. The second argument 
    // is a code for us to use to set an error message.

	@Override
	public ExecutableValidator forExecutables() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public BeanDescriptor getConstraintsForClass(Class<?> arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <T> T unwrap(Class<T> arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <T> Set<ConstraintViolation<T>> validate(T arg0, Class<?>... arg1) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <T> Set<ConstraintViolation<T>> validateProperty(T arg0, String arg1, Class<?>... arg2) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <T> Set<ConstraintViolation<T>> validateValue(Class<T> arg0, String arg1, Object arg2, Class<?>... arg3) {
		// TODO Auto-generated method stub
		return null;
	}
}
