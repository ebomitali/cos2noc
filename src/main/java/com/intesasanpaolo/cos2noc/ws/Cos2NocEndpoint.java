package com.intesasanpaolo.cos2noc.ws;

import com.intesasanpaolo.cos2noc.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import com.intesasanpaolo.cos2noc.cosmodel.CosModelUpdater;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Endpoint
public class Cos2NocEndpoint {
	private static final String NAMESPACE_URI = "http://intesasanpaolo.com/cos2noc";
	private Cos2NocServiceImpl cos2NocServiceImpl;
	private CosModelUpdater cosModelUpdater;
	private Logger logger = LoggerFactory.getLogger(Cos2NocEndpoint.class);

	@Autowired
	public Cos2NocEndpoint(Cos2NocServiceImpl cos2NocServiceImpl, CosModelUpdater cosModelUpdater) {
		this.cos2NocServiceImpl = cos2NocServiceImpl;
		this.cosModelUpdater = cosModelUpdater;
	}

	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "processBizEventRequest")
	@ResponsePayload
	public ProcessBizEventResponse processBizEvent(@RequestPayload ProcessBizEventRequest request) {
		logger.info("Received processBizEvent request");
		ProcessBizEventResponse response = new ProcessBizEventResponse();
		//do something response.setCountry(countryRepository.findCountry(request.getName()));

		return response;
	}

	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "setModelRequest")
	@ResponsePayload
	public SetModelResponse setModel(@RequestPayload SetModelRequest request) {
		logger.info("Received setModel request");
		Model model = request.getEntries();
		logger.info("Retrieved model");
		List<String> cosModelRes = this.cosModelUpdater.setModel(model);

		SetModelResponse response = new SetModelResponse();

		List<String> rr = response.getResponse();
		for (String ss : cosModelRes) {
			rr.add(ss);
		}

		logger.info("Returned res");

		return response;
	}
}
