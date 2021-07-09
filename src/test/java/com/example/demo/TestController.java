package com.example.demo;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;


@DataJpaTest
class TestController {
	@Mock 
	private UuidRepo repo;

	
	@Test
	void testList() {
		UUIDClass uuid = Mockito.mock(UUIDClass.class);
		when(repo.save(Mockito.any(UUIDClass.class))).thenAnswer(i -> i.getArguments()[0]);
		when(repo.findAll()).thenReturn(Arrays.asList(uuid));
		assertEquals(1, repo.count());
	}

	@Test
	void testListOfUuids() {
		UUIDClass uuid = Mockito.mock(UUIDClass.class);
		when(repo.findAll()).thenReturn(Arrays.asList(uuid));
		assertEquals(1, repo.count());
	}
//
//	@Test
//	void testListOfUuidsUUID() {
//		UUIDClass uuid = Mockito.mock(UUIDClass.class);
//		when(repo.findById(uuid)).thenReturn(uuid);
//		assertEquals(1, repo.count());
//	}

	@Test
	void testCreatUuid() {
		UUIDClass uuid = Mockito.mock(UUIDClass.class);
		when(repo.save(Mockito.any(UUIDClass.class))).thenReturn(uuid);
		UUIDController uuidController = new UUIDController();
		assertEquals(uuid, uuidController.creatUuid(uuid));
	}

//	@Test
//	void testDeleteuuid() {
//		UUIDClass uuid = Mockito.mock(UUIDClass.class);
//		when(repo.delete(Mockito.any(UUIDClass.class))).thenReturn(uuid);
//		UUIDController uuidController = new UUIDController();
//		assertEquals(uuid, uuidController.creatUuid(uuid));
//	}
//
//	@Test
//	void testUpdateuuid() {
//		fail("Not yet implemented");
//	}

}
