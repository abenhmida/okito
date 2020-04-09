package com.nvilla.calories.controller;

import java.util.List;

import javax.annotation.Nonnull;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.nvilla.calories.DTO.FitnessUserDTO;
import com.nvilla.calories.DTO.ReportDataDTO;
import com.nvilla.calories.service.ReportDataService;

@Controller
public class ReportController extends AbstractController {
	
	private final ReportDataService reportDataService;

    @Autowired
    public ReportController(@Nonnull final ReportDataService reportDataService) {
        this.reportDataService = reportDataService;
    }

    @RequestMapping(value = {"/report"}, method = RequestMethod.GET)
    @Nonnull
    public final String viewMainReportPage() {
        return REPORT_TEMPLATE;
    }

    @RequestMapping(value = {"/report/get"}, method = RequestMethod.GET)
    @ResponseBody
    @Nonnull
    public final List<ReportDataDTO> getReportData() {
        final FitnessUserDTO userDTO = currentAuthenticatedUser();
        return reportDataService.findByUser(userDTO.getId());
    }

}
