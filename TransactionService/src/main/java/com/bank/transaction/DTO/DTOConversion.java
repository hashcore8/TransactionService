package com.bank.transaction.DTO;

import java.text.ParseException;

import org.modelmapper.ModelMapper;
import org.modelmapper.TypeMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.bank.transaction.entity.Transaction;

@Component
public class DTOConversion {

	@Autowired
	private ModelMapper modelMapper;

	public Transaction convertToEntity(TransactionDTO transactDto) throws ParseException {

		//System.out.println("CustomerDto modelMapper:" + transactDto.toString());

		TypeMap<TransactionDTO, Transaction> createTypeMap = modelMapper.createTypeMap(TransactionDTO.class, Transaction.class);
		Transaction map = createTypeMap.map(transactDto);
		
		System.out.println("Transacrtion MAp:"+map.toString());
		
		Transaction transact = modelMapper.map(transactDto, Transaction.class);

		return transact;
	}
}
