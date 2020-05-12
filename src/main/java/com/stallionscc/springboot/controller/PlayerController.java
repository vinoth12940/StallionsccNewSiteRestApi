package com.stallionscc.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.stallionscc.springboot.entity.Player;
import com.stallionscc.springboot.exception.ResourceNotFoundException;
import com.stallionscc.springboot.repository.PlayerRepository;

@RestController
@RequestMapping("/api/players")
public class PlayerController {
	
	@Autowired
	private PlayerRepository playerRepository;
	
	// get all Players
		@GetMapping
		public List<Player> getAllPlayers() {
			return this.playerRepository.findAll();
		}
		
		// get Player by id
		@GetMapping("/{id}")
		public Player getPlayerById(@PathVariable (value = "id") long playerId) {
			return this.playerRepository.findById(playerId)
					.orElseThrow(() -> new ResourceNotFoundException("Player not found with id :" + playerId));
		}
		
		// create Player
		@PostMapping
		public Player createPlayer(@RequestBody Player player) {
			return this.playerRepository.save(player);
		}
		
		// update Player
		@PutMapping("/{id}")
		public Player updatePlayer(@RequestBody Player player, @PathVariable ("id") long playerId) {
			 Player existingPlayer = this.playerRepository.findById(playerId)
				.orElseThrow(() -> new ResourceNotFoundException("Player not found with id :" + playerId));
			 existingPlayer.setFirstName(player.getFirstName());
			 existingPlayer.setLastName(player.getLastName());
			 existingPlayer.setDate_of_birth(player.getDate_of_birth());
			 existingPlayer.setBorn_place(player.getBorn_place());
			 existingPlayer.setNick_name(player.getNick_name());
			 existingPlayer.setBatting_style(player.getBatting_style());
			 existingPlayer.setBowling_style(player.getBowling_style());
			 existingPlayer.setPlayer_role(player.getPlayer_role());
			 existingPlayer.setPersonal_contact_email_id(player.getPersonal_contact_email_id());
			 existingPlayer.setAddress(player.getAddress());
			 existingPlayer.setContact_number(player.getContact_number());
			 existingPlayer.setIs_player_active(player.getIs_player_active());
			 existingPlayer.setImage_path(player.getImage_path());
			 return this.playerRepository.save(existingPlayer);
		}
		
		// delete Player by id
		@DeleteMapping("/{id}")
		public ResponseEntity<Player> deletePlayer(@PathVariable ("id") long playerId){
			 Player existingPlayer = this.playerRepository.findById(playerId)
						.orElseThrow(() -> new ResourceNotFoundException("Player not found with id :" + playerId));
			 this.playerRepository.delete(existingPlayer);
			 return ResponseEntity.ok().build();
		}
		
		@GetMapping("/getActiveplayers")
		public List<Player> getallActiveplayer(){
			return this.playerRepository.fetchallActiveplayers();
		}
}
