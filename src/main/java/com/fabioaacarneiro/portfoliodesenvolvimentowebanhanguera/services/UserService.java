package com.fabioaacarneiro.portfoliodesenvolvimentowebanhanguera.services;

import com.fabioaacarneiro.portfoliodesenvolvimentowebanhanguera.entities.User;
import com.fabioaacarneiro.portfoliodesenvolvimentowebanhanguera.repositories.UserRepository;
import com.fabioaacarneiro.portfoliodesenvolvimentowebanhanguera.services.exceptions.ResourceCannotBeUpdatedException;
import com.fabioaacarneiro.portfoliodesenvolvimentowebanhanguera.services.exceptions.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;

	public List<User> findAll(){
		return userRepository.findAll();
	}
	public User findById(Long id){
		Optional<User> optionalUser = userRepository.findById(id);
		return optionalUser.orElseThrow(ResourceNotFoundException::new);
	}

	public User insert(User user) {
		return userRepository.save(user);
	}

	public void delete(Long id) {
		try {
			User userToBeDeleted = findById(id);
			userRepository.deleteById(userToBeDeleted.getId());
		} catch (ResourceNotFoundException e) {
			throw new ResourceNotFoundException();
		}
	}

	public User update(Long id, User newDataUser) {
		try {
			User userToBeUpdated;
			try {
				userToBeUpdated = findById(id);
			} catch (RuntimeException e) {
				throw new ResourceNotFoundException();
			}
			userToBeUpdated.setNome(newDataUser.getNome());
			userToBeUpdated.setEmail(newDataUser.getEmail());
			userToBeUpdated.setPassword(newDataUser.getPassword());
			userToBeUpdated.setTelefone(newDataUser.getTelefone());
			return userRepository.save(userToBeUpdated);
		} catch (RuntimeException e) {
			throw new ResourceCannotBeUpdatedException();
		}
	}
}
