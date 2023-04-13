package vn.com.vti.springexam.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import vn.com.vti.springexam.entity.JobType;
import vn.com.vti.springexam.entity.JobTypeExample;
import vn.com.vti.springexam.mapper.JobTypeMapper;

@Controller
@RequestMapping("jobtype")
public class JobTypeController {
	
	@Autowired
	private JobTypeMapper jobTypeMapper;

	@RequestMapping("list")
	
	public String list (Model model) {
	JobTypeExample jobTypeExample = new JobTypeExample();
	jobTypeExample.setOrderByClause("job_type_id");
	
	List<JobType> jobtypeList = jobTypeMapper.selectByExample(jobTypeExample);
	model.addAttribute("jobtypeList",jobtypeList);
	return "jobtype/list";
	}

}
