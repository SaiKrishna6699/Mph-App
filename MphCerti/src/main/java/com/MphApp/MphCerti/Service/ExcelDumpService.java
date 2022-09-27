package com.MphApp.MphCerti.Service;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.MphApp.MphCerti.entity.ExcelDump;
import com.MphApp.MphCerti.Repo.ExcelDumpRepo;
import com.MphApp.MphCerti.Helper.ExcelHelper;

@Service
public class ExcelDumpService {

	@Autowired
	private ExcelDumpRepo EDRepo;

	public void save(MultipartFile file) {
		try {
			List<ExcelDump> exceldump = ExcelHelper.convertExceltoList(file.getInputStream());
			this.EDRepo.saveAll(exceldump);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public List<ExcelDump> getAllProducts() {
		return this.EDRepo.findAll();

	}

}
