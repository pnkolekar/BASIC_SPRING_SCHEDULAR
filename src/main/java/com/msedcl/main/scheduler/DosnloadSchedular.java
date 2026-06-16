package com.msedcl.main.scheduler;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

import com.msedcl.main.service.PDFDownloadService;

import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class DosnloadSchedular {

	final PDFDownloadService downloadService;
	
	@Scheduled(initialDelay = 2000)
	void run() {
		downloadService.downloadAllPdfs();
	}
}
