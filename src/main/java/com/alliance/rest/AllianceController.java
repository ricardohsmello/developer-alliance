package com.alliance.rest;

import com.alliance.model.AllianceService;
import com.alliance.model.MyEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/alliance")
public class AllianceController {

	private final AllianceService allianceService;

	AllianceController(AllianceService allianceService) {
		this.allianceService = allianceService;
	}

	@GetMapping
	public ResponseEntity<List<MyEntity>> alliance() {
		return ResponseEntity.ok(allianceService.findByProdIdWithLimitAndSkip(0, 1000));
	}
}
