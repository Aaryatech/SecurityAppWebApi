package com.ats.securitywebapi.SecurityApp.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ats.securitywebapi.SecurityApp.Repo.CompanyRepository;
import com.ats.securitywebapi.SecurityApp.Repo.EmpTypeRepository;
import com.ats.securitywebapi.SecurityApp.Repo.EmployeeAccesoriesRepo;
import com.ats.securitywebapi.SecurityApp.Repo.EmployeeCategoryRepository;
import com.ats.securitywebapi.SecurityApp.Repo.EmployeeDepartmentRepository;
import com.ats.securitywebapi.SecurityApp.Repo.EmployeeInfoRepository;
import com.ats.securitywebapi.SecurityApp.Repo.GatePassVisitorRepository;
import com.ats.securitywebapi.SecurityApp.Repo.GateRepo;
import com.ats.securitywebapi.SecurityApp.Repo.NotificationRepo;
import com.ats.securitywebapi.SecurityApp.Repo.PersonRepo;
import com.ats.securitywebapi.SecurityApp.Repo.ProductionAccessRepo;
import com.ats.securitywebapi.SecurityApp.Repo.PurposeRepo;
import com.ats.securitywebapi.SecurityApp.Repo.SalaryBracketRepo;
import com.ats.securitywebapi.SecurityApp.model.Company;
import com.ats.securitywebapi.SecurityApp.model.EmpType;
import com.ats.securitywebapi.SecurityApp.model.EmployeeAccesories;
import com.ats.securitywebapi.SecurityApp.model.EmployeeCategory;
import com.ats.securitywebapi.SecurityApp.model.EmployeeDepartment;
import com.ats.securitywebapi.SecurityApp.model.EmployeeInfo;
import com.ats.securitywebapi.SecurityApp.model.Gate;
import com.ats.securitywebapi.SecurityApp.model.GatePassVisitor;
import com.ats.securitywebapi.SecurityApp.model.Info;
import com.ats.securitywebapi.SecurityApp.model.Person;
import com.ats.securitywebapi.SecurityApp.model.ProductionAccess;
import com.ats.securitywebapi.SecurityApp.model.Purpose;
import com.ats.securitywebapi.SecurityApp.model.SalaryBracket;
import com.ats.securitywebapi.SecurityApp.model.Notification;

public class masterController {

	@Autowired 
	ProductionAccessRepo productionAccessRepo;
	
	@Autowired 
	GateRepo gateRepo;
	
	@Autowired 
	PurposeRepo purposeRepo;
	
	@Autowired 
	SalaryBracketRepo salaryBracketRepo;
	
	@Autowired
	PersonRepo personRepo;
	 
	@Autowired
	EmployeeAccesoriesRepo employeeAccesoriesRepo;
	
	@Autowired
	NotificationRepo notificationRepo;
	
	@Autowired
	CompanyRepository companyRepository;
	
	@Autowired
	EmpTypeRepository empTypeRepository; 

	@Autowired
	EmployeeCategoryRepository employeeCategoryRepository;

	@Autowired
	EmployeeDepartmentRepository employeeDepartmentRepository;

	@Autowired
	EmployeeInfoRepository employeeInfoRepository;
	
	@Autowired
	GatePassVisitorRepository gatePassVisitorRepository;
	
	
	@RequestMapping(value = { "/saveProAccess" }, method = RequestMethod.POST)
	public @ResponseBody ProductionAccess saveProAccess(@RequestBody ProductionAccess user) {

		ProductionAccess save = new ProductionAccess();
		try {

			save = productionAccessRepo.saveAndFlush(user);

			if (save != null) {
				save.setError(false);
			} else {

				save = new ProductionAccess();
				save.setError(true);
			}

		} catch (Exception e) {
			save = new ProductionAccess();
			save.setError(true);
			e.printStackTrace();
		}

		return save;
	}

	@RequestMapping(value = { "/getAllProAccessList" }, method = RequestMethod.GET)
	public @ResponseBody List<ProductionAccess> getAllProAccessList() {

		List<ProductionAccess> list = new ArrayList<ProductionAccess>();
		try {

			list = productionAccessRepo.findByDelStatusOrderByProductionAccessIdDesc(1);

		} catch (Exception e) {

			e.printStackTrace();
		}

		return list;

	}

	@RequestMapping(value = { "/getProAccessList" }, method = RequestMethod.POST)
	public @ResponseBody ProductionAccess getProAccessList(@RequestParam("productionAccessId") int productionAccessId) {

		ProductionAccess list = new ProductionAccess();
		try {

			list = productionAccessRepo.findByProductionAccessIdAndDelStatusOrderByProductionAccessIdDesc(productionAccessId,1);

		} catch (Exception e) {

			e.printStackTrace();
		}

		return list;

	}

	@RequestMapping(value = { "/deleteProAccess" }, method = RequestMethod.POST)
	public @ResponseBody Info deleteProAccess(@RequestParam("productionAccessId") int productionAccessId) {

		Info info = new Info();

		try {

			int delete = productionAccessRepo.deleteProduction(productionAccessId);

			if (delete > 0) {
				info.setError(false);
				info.setMsg("deleted");
			} else {
				info.setError(true);
				info.setMsg("failed");
			}

		} catch (Exception e) {

			e.printStackTrace();
			info.setError(true);
			info.setMsg("failed");
		}

		return info;

	}
	
	@RequestMapping(value = { "/saveGate" }, method = RequestMethod.POST)
	public @ResponseBody Gate saveGate(@RequestBody Gate gate) {

		Gate save = new Gate();
		try {

			save = gateRepo.saveAndFlush(gate);

			if (save != null) {
				save.setError(false);
			} else {

				save = new Gate();
				save.setError(true);
			}

		} catch (Exception e) {
			save = new Gate();
			save.setError(true);
			e.printStackTrace();
		}

		return save;
	}

	@RequestMapping(value = { "/getAllGateList" }, method = RequestMethod.GET)
	public @ResponseBody List<Gate> getAllGateList() {

		List<Gate> list = new ArrayList<Gate>();
		try {

			list = gateRepo.findByDelStatusOrderByGateIdDesc(1);

		} catch (Exception e) {

			e.printStackTrace();
		}

		return list;

	}

	@RequestMapping(value = { "/getGateList" }, method = RequestMethod.POST)
	public @ResponseBody Gate getGateList(@RequestParam("gateId") int gateId) {

		Gate list = new Gate();
		try {

			list = gateRepo.findByGateIdAndDelStatusOrderByGateIdDesc(gateId,1);

		} catch (Exception e) {

			e.printStackTrace();
		}

		return list;

	}

	@RequestMapping(value = { "/deleteGate" }, method = RequestMethod.POST)
	public @ResponseBody Info deleteGate(@RequestParam("gateId") int gateId) {

		Info info = new Info();

		try {

			int delete = gateRepo.deleteGate(gateId);

			if (delete > 0) {
				info.setError(false);
				info.setMsg("deleted");
			} else {
				info.setError(true);
				info.setMsg("failed");
			}

		} catch (Exception e) {

			e.printStackTrace();
			info.setError(true);
			info.setMsg("failed");
		}

		return info;

	}
	
	@RequestMapping(value = { "/saveGate" }, method = RequestMethod.POST)
	public @ResponseBody Purpose saveGate(@RequestBody Purpose purpose) {

		Purpose save = new Purpose();
		try {

			save = purposeRepo.saveAndFlush(purpose);

			if (save != null) {
				save.setError(false);
			} else {

				save = new Purpose();
				save.setError(true);
			}

		} catch (Exception e) {
			save = new Purpose();
			save.setError(true);
			e.printStackTrace();
		}

		return save;
	}

	@RequestMapping(value = { "/getAllPurposeList" }, method = RequestMethod.GET)
	public @ResponseBody List<Purpose> getAllPurposeList() {

		List<Purpose> list = new ArrayList<Purpose>();
		try {

			list = purposeRepo.findByDelStatusOrderByPurposeIdDesc(1);

		} catch (Exception e) {

			e.printStackTrace();
		}

		return list;

	}

	@RequestMapping(value = { "/getPurposeList" }, method = RequestMethod.POST)
	public @ResponseBody Purpose getPurposeList(@RequestParam("purposeId") int purposeId) {

		Purpose list = new Purpose();
		try {

			list = purposeRepo.findByPurposeIdAndDelStatusOrderByPurposeIdDesc(purposeId,1);

		} catch (Exception e) {

			e.printStackTrace();
		}

		return list;

	}

	@RequestMapping(value = { "/deletePurpose" }, method = RequestMethod.POST)
	public @ResponseBody Info deletePurpose(@RequestParam("purposeId") int purposeId) {

		Info info = new Info();

		try {

			int delete = purposeRepo.deletePurpose(purposeId);

			if (delete > 0) {
				info.setError(false);
				info.setMsg("deleted");
			} else {
				info.setError(true);
				info.setMsg("failed");
			}

		} catch (Exception e) {

			e.printStackTrace();
			info.setError(true);
			info.setMsg("failed");
		}

		return info;

	}
	
	@RequestMapping(value = { "/saveSalaryBracket" }, method = RequestMethod.POST)
	public @ResponseBody SalaryBracket saveSalaryBracket(@RequestBody SalaryBracket salaryBracket) {

		SalaryBracket save = new SalaryBracket();
		try {

			save = salaryBracketRepo.saveAndFlush(salaryBracket);

			if (save != null) {
				save.setError(false);
			} else {

				save = new SalaryBracket();
				save.setError(true);
			}

		} catch (Exception e) {
			save = new SalaryBracket();
			save.setError(true);
			e.printStackTrace();
		}

		return save;
	}

	@RequestMapping(value = { "/getAllSalaryBracketList" }, method = RequestMethod.GET)
	public @ResponseBody List<SalaryBracket> getAllSalaryBracketList() {

		List<SalaryBracket> list = new ArrayList<SalaryBracket>();
		try {

			list = salaryBracketRepo.findByDelStatusOrderBySalaryIdDesc(1);

		} catch (Exception e) {

			e.printStackTrace();
		}

		return list;

	}

	@RequestMapping(value = { "/getPurposeList" }, method = RequestMethod.POST)
	public @ResponseBody SalaryBracket getSalaryBracketList(@RequestParam("salaryId") int salaryId) {

		SalaryBracket list = new SalaryBracket();
		try {

			list = salaryBracketRepo.findBySalaryIdAndDelStatusOrderBySalaryIdDesc(salaryId,1);

		} catch (Exception e) {

			e.printStackTrace();
		}

		return list;

	}

	@RequestMapping(value = { "/deleteSalaryBracket" }, method = RequestMethod.POST)
	public @ResponseBody Info deleteSalaryBracket(@RequestParam("salaryId") int salaryId) {

		Info info = new Info();

		try {

			int delete = salaryBracketRepo.deleteSalaryId(salaryId);

			if (delete > 0) {
				info.setError(false);
				info.setMsg("deleted");
			} else {
				info.setError(true);
				info.setMsg("failed");
			}

		} catch (Exception e) {

			e.printStackTrace();
			info.setError(true);
			info.setMsg("failed");
		}

		return info;

	}
	@RequestMapping(value = { "/savePerson" }, method = RequestMethod.POST)
	public @ResponseBody Person savePerson(@RequestBody Person user) {

		Person save = new Person();
		try {

			save = personRepo.saveAndFlush(user);

			if (save != null) {
				save.setError(false);
			} else {

				save = new Person();
				save.setError(true);
			}

		} catch (Exception e) {
			save = new Person();
			save.setError(true);
			e.printStackTrace();
		}

		return save;
	}

	@RequestMapping(value = { "/getAllPersonList" }, method = RequestMethod.GET)
	public @ResponseBody List<Person> getAllPersonList() {

		List<Person> list = new ArrayList<Person>();
		try {

			list = personRepo.findByDelStatusOrderByIdDesc(1);

		} catch (Exception e) {

			e.printStackTrace();
		}

		return list;

	}

	@RequestMapping(value = { "/getPersonList" }, method = RequestMethod.POST)
	public @ResponseBody Person getPersonList(@RequestParam("id") int id) {

		Person list = new Person();
		try {

			list = personRepo.findByIdAndDelStatusOrderByIdDesc(id,1);

		} catch (Exception e) {

			e.printStackTrace();
		}

		return list;

	}

	@RequestMapping(value = { "/deletePerson" }, method = RequestMethod.POST)
	public @ResponseBody Info deletePerson(@RequestParam("id") int id) {

		Info info = new Info();

		try {

			int delete = personRepo.deletePerson(id);

			if (delete > 0) {
				info.setError(false);
				info.setMsg("deleted");
			} else {
				info.setError(true);
				info.setMsg("failed");
			}

		} catch (Exception e) {

			e.printStackTrace();
			info.setError(true);
			info.setMsg("failed");
		}

		return info;

	}
	@RequestMapping(value = { "/saveEmpAcces" }, method = RequestMethod.POST)
	public @ResponseBody EmployeeAccesories saveEmpAcces(@RequestBody EmployeeAccesories user) {

		EmployeeAccesories save = new EmployeeAccesories();
		try {

			save = employeeAccesoriesRepo.saveAndFlush(user);

			if (save != null) {
				save.setError(false);
			} else {

				save = new EmployeeAccesories();
				save.setError(true);
			}

		} catch (Exception e) {
			save = new EmployeeAccesories();
			save.setError(true);
			e.printStackTrace();
		}

		return save;
	}

	@RequestMapping(value = { "/getAllEmpAccesList" }, method = RequestMethod.GET)
	public @ResponseBody List<EmployeeAccesories> getAllEmpAccesList() {

		List<EmployeeAccesories> list = new ArrayList<EmployeeAccesories>();
		try {

			list = employeeAccesoriesRepo.findByDelStatusOrderByEmpAccsoriesIdDesc(1);

		} catch (Exception e) {

			e.printStackTrace();
		}

		return list;

	}

	@RequestMapping(value = { "/getEmpAccesList" }, method = RequestMethod.POST)
	public @ResponseBody EmployeeAccesories getEmpAccesList(@RequestParam("empAccsoriesId") int empAccsoriesId) {

		EmployeeAccesories list = new EmployeeAccesories();
		try {

			list = employeeAccesoriesRepo.findByEmpAccsoriesIdAndDelStatusOrderByEmpAccsoriesIdDesc(empAccsoriesId,1);

		} catch (Exception e) {

			e.printStackTrace();
		}

		return list;

	}

	@RequestMapping(value = { "/deleteEmpAcces" }, method = RequestMethod.POST)
	public @ResponseBody Info deleteEmpAcces(@RequestParam("empAccsoriesId") int empAccsoriesId) {

		Info info = new Info();

		try {

			int delete = employeeAccesoriesRepo.deleteEmpAcces(empAccsoriesId);

			if (delete > 0) {
				info.setError(false);
				info.setMsg("deleted");
			} else {
				info.setError(true);
				info.setMsg("failed");
			}

		} catch (Exception e) {

			e.printStackTrace();
			info.setError(true);
			info.setMsg("failed");
		}

		return info;

	}
	@RequestMapping(value = { "/saveNotification" }, method = RequestMethod.POST)
	public @ResponseBody Notification saveNotification(@RequestBody Notification user) {

		Notification save = new Notification();
		try {

			save = notificationRepo.saveAndFlush(user);

			if (save != null) {
				save.setError(false);
			} else {

				save = new Notification();
				save.setError(true);
			}

		} catch (Exception e) {
			save = new Notification();
			save.setError(true);
			e.printStackTrace();
		}

		return save;
	}

	@RequestMapping(value = { "/getAllEmpAccesList" }, method = RequestMethod.GET)
	public @ResponseBody List<Notification> getAllNotificationList() {

		List<Notification> list = new ArrayList<Notification>();
		try {

			list = notificationRepo.findByDelStatusOrderByNotificationIdDesc(1);

		} catch (Exception e) {

			e.printStackTrace();
		}

		return list;

	}

	@RequestMapping(value = { "/getNotificationList" }, method = RequestMethod.POST)
	public @ResponseBody Notification getNotificationList(@RequestParam("notificationId") int notificationId) {

		Notification list = new Notification();
		try {

			list = notificationRepo.findByNotificationIdAndDelStatusOrderByNotificationIdDesc(notificationId,1);

		} catch (Exception e) {

			e.printStackTrace();
		}

		return list;

	}

	@RequestMapping(value = { "/deleteNotification" }, method = RequestMethod.POST)
	public @ResponseBody Info deleteNotification(@RequestParam("notificationId") int notificationId) {

		Info info = new Info();

		try {

			int delete = notificationRepo.deleteNotification(notificationId);

			if (delete > 0) {
				info.setError(false);
				info.setMsg("deleted");
			} else {
				info.setError(true);
				info.setMsg("failed");
			}

		} catch (Exception e) {

			e.printStackTrace();
			info.setError(true);
			info.setMsg("failed");
		}

		return info;

	}
	@RequestMapping(value = { "/saveCompany" }, method = RequestMethod.POST)
	public @ResponseBody Company saveLoginLogs(@RequestBody Company company) {

		Company save = new Company();
		try {

			save = companyRepository.saveAndFlush(company);

		} catch (Exception e) {

			e.printStackTrace();
		}

		return save;

	}

	@RequestMapping(value = { "/getCompanyList" }, method = RequestMethod.GET)
	public @ResponseBody List<Company> getCompanyList() {

		List<Company> list = new ArrayList<Company>();
		try {

			list = companyRepository.findByDelStatusOrderByCompanyIdDesc(1);

		} catch (Exception e) {

			e.printStackTrace();
		}

		return list;

	}

	@RequestMapping(value = { "/deleteCompany" }, method = RequestMethod.POST)
	public @ResponseBody Info deleteCompany(@RequestParam("compId") int compId) {

		Info info = new Info();

		try {

			int delete = companyRepository.deleteCompany(compId);

			if (delete > 0) {
				info.setError(false);
				info.setMsg("deleted");
			} else {
				info.setError(true);
				info.setMsg("failed");
			}

		} catch (Exception e) {

			e.printStackTrace();
			info.setError(true);
			info.setMsg("failed");
		}

		return info;

	}

	@RequestMapping(value = { "/getCompanyById" }, method = RequestMethod.POST)
	public @ResponseBody Company getCompanyById(@RequestParam("compId") int compId) {

		Company company = new Company();
		try {

			company = companyRepository.findByCompanyIdAndDelStatus(compId, 1);

		} catch (Exception e) {

			e.printStackTrace();
		}

		return company;

	}
	@RequestMapping(value = { "/saveEmpType" }, method = RequestMethod.POST)
	public @ResponseBody EmpType saveEmpType(@RequestBody EmpType empType) {

		EmpType save = new EmpType();
		try {

			save = empTypeRepository.saveAndFlush(empType);

			if (save == null) {

				save = new EmpType();
				save.setError(true);

			} else {
				save.setError(false);
			}

		} catch (Exception e) {

			e.printStackTrace();
			save.setError(true);
		}

		return save;

	}

	@RequestMapping(value = { "/getEmpTypeList" }, method = RequestMethod.POST)
	public @ResponseBody List<EmpType> getEmpTypeList(@RequestParam("compId") int compId) {

		List<EmpType> list = new ArrayList<EmpType>();
		try {

			if (compId != 0) {
				list = empTypeRepository.findByDelStatusAndCompanyId(1, compId);
			} else {
				list = empTypeRepository.findByDelStatus(1);
			}

		} catch (Exception e) {

			e.printStackTrace();
		}

		return list;

	}

	@RequestMapping(value = { "/deleteEmpType" }, method = RequestMethod.POST)
	public @ResponseBody Info deleteEmpType(@RequestParam("empTypeId") int empTypeId) {

		Info info = new Info();

		try {

			int delete = empTypeRepository.deleteEmpType(empTypeId);

			if (delete > 0) {
				info.setError(false);
				info.setMsg("deleted");
			} else {
				info.setError(true);
				info.setMsg("failed");
			}

		} catch (Exception e) {

			e.printStackTrace();
			info.setError(true);
			info.setMsg("failed");
		}

		return info;

	}

	@RequestMapping(value = { "/getEmpTypeById" }, method = RequestMethod.POST)
	public @ResponseBody EmpType getEmpTypeById(@RequestParam("empTypeId") int empTypeId) {

		EmpType location = new EmpType();
		try {

			location = empTypeRepository.findByEmpTypeIdAndDelStatus(empTypeId, 1);

		} catch (Exception e) {

			e.printStackTrace();
		}

		return location;

	}

	@RequestMapping(value = { "/saveEmpCategory" }, method = RequestMethod.POST)
	public @ResponseBody EmployeeCategory saveEmpCategory(@RequestBody EmployeeCategory employeeCategory) {

		EmployeeCategory save = new EmployeeCategory();
		try {

			save = employeeCategoryRepository.saveAndFlush(employeeCategory);

			if (save != null) {
				save.setError(false);
			} else {

				save = new EmployeeCategory();
				save.setError(true);
			}

		} catch (Exception e) {
			save = new EmployeeCategory();
			save.setError(true);
			e.printStackTrace();
		}

		return save;

	}

	@RequestMapping(value = { "/getEmpCategoryList" }, method = RequestMethod.POST)
	public @ResponseBody List<EmployeeCategory> getEmpCategoryList(@RequestParam("compId") int compId) {

		List<EmployeeCategory> list = new ArrayList<EmployeeCategory>();
		try {

			if (compId != 0) {

				list = employeeCategoryRepository.findByDelStatusAndCompanyId(1, compId);

			} else {

				list = employeeCategoryRepository.findByDelStatus(1);

			}

		} catch (Exception e) {

			e.printStackTrace();
		}

		return list;

	}

	@RequestMapping(value = { "/deleteEmpCategory" }, method = RequestMethod.POST)
	public @ResponseBody Info deleteEmpCategory(@RequestParam("empCatId") int empCatId) {

		Info info = new Info();

		try {

			int delete = employeeCategoryRepository.deleteEmpCategory(empCatId);

			if (delete > 0) {
				info.setError(false);
				info.setMsg("deleted");
			} else {
				info.setError(true);
				info.setMsg("failed");
			}

		} catch (Exception e) {

			e.printStackTrace();
			info.setError(true);
			info.setMsg("failed");
		}

		return info;

	}

	@RequestMapping(value = { "/getEmpCategoryById" }, method = RequestMethod.POST)
	public @ResponseBody EmployeeCategory getEmpCategoryById(@RequestParam("empCatId") int empCatId) {

		EmployeeCategory employeeCategory = new EmployeeCategory();
		try {

			employeeCategory = employeeCategoryRepository.findByEmpCatIdAndDelStatus(empCatId, 1);

		} catch (Exception e) {

			e.printStackTrace();
		}

		return employeeCategory;

	}

	@RequestMapping(value = { "/saveEmpDept" }, method = RequestMethod.POST)
	public @ResponseBody EmployeeDepartment saveEmpDept(@RequestBody EmployeeDepartment employeeDepartment) {

		EmployeeDepartment save = new EmployeeDepartment();
		try {

			save = employeeDepartmentRepository.saveAndFlush(employeeDepartment);

			if (save != null) {
				save.setError(false);
			} else {
				save = new EmployeeDepartment();
				save.setError(true);
			}

		} catch (Exception e) {

			e.printStackTrace();
		}

		return save;

	}

	@RequestMapping(value = { "/getEmpDeptList" }, method = RequestMethod.POST)
	public @ResponseBody List<EmployeeDepartment> getEmpDeptList(@RequestParam("compId") int compId) {

		List<EmployeeDepartment> list = new ArrayList<EmployeeDepartment>();
		try {
			if (compId != 0) {
				list = employeeDepartmentRepository.findByDelStatusAndCompanyId(1, compId);
			} else {
				list = employeeDepartmentRepository.findByDelStatus(1);
			}

		} catch (Exception e) {

			e.printStackTrace();
		}

		return list;

	}

	@RequestMapping(value = { "/deleteEmpDept" }, method = RequestMethod.POST)
	public @ResponseBody Info deleteEmpDept(@RequestParam("empDeptId") int empDeptId) {

		Info info = new Info();

		try {

			int delete = employeeDepartmentRepository.deleteEmpDept(empDeptId);

			if (delete > 0) {
				info.setError(false);
				info.setMsg("deleted");
			} else {
				info.setError(true);
				info.setMsg("failed");
			}

		} catch (Exception e) {

			e.printStackTrace();
			info.setError(true);
			info.setMsg("failed");
		}

		return info;

	}

	@RequestMapping(value = { "/getEmpDeptById" }, method = RequestMethod.POST)
	public @ResponseBody EmployeeDepartment getEmpDeptById(@RequestParam("empDeptId") int empDeptId) {

		EmployeeDepartment company = new EmployeeDepartment();
		try {

			company = employeeDepartmentRepository.findByEmpDeptIdAndDelStatus(empDeptId, 1);

		} catch (Exception e) {

			e.printStackTrace();
		}

		return company;

	}

	@RequestMapping(value = { "/saveEmpInfo" }, method = RequestMethod.POST)
	public @ResponseBody EmployeeInfo saveEmpInfo(@RequestBody EmployeeInfo employeeDepartment) {

		EmployeeInfo save = new EmployeeInfo();
		try {

			save = employeeInfoRepository.saveAndFlush(employeeDepartment);

			if (save == null) {

				save = new EmployeeInfo();
				save.setError(true);

			} else {
				save.setError(false);
			}

		} catch (Exception e) {

			e.printStackTrace();
		}

		return save;

	}

	@RequestMapping(value = { "/updateToken" }, method = RequestMethod.POST)
	public @ResponseBody Info updateToken(@RequestParam("empId") int empId, @RequestParam("token") String token) {

		Info info = new Info();

		try {
			int res = employeeInfoRepository.updateUserToken(empId, token);

			if (res == 1) {
				info.setError(false);
				info.setMsg("Successfully Updated Token");
			} else {
				info.setError(true);
				info.setMsg(" Error Failed to Update Token");
			}

		} catch (Exception e) {

			e.printStackTrace();
			info.setError(true);
			info.setMsg("Exce Failed to Update Token ");

		}
		return info;

	}
	
	@RequestMapping(value = { "/saveGatePassVisitor" }, method = RequestMethod.POST)
	public @ResponseBody GatePassVisitor saveGatePassVisitor(@RequestBody GatePassVisitor user) {

		GatePassVisitor save = new GatePassVisitor();
		try {

			save = gatePassVisitorRepository.saveAndFlush(user);

			if (save != null) {
				save.setError(false);
			} else {

				save = new GatePassVisitor();
				save.setError(true);
			}

		} catch (Exception e) {
			save = new GatePassVisitor();
			save.setError(true);
			e.printStackTrace();
		}

		return save;
	}

	@RequestMapping(value = { "/getAllGatePassVisitorList" }, method = RequestMethod.GET)
	public @ResponseBody List<GatePassVisitor> getAllGatePassVisitorList() {

		List<GatePassVisitor> list = new ArrayList<GatePassVisitor>();
		try {

			list = gatePassVisitorRepository.findByDelStatusOrderByGatepassVisitorIdDesc(1);

		} catch (Exception e) {

			e.printStackTrace();
		}

		return list;

	}

	@RequestMapping(value = { "/getGatePassVisitorList" }, method = RequestMethod.POST)
	public @ResponseBody GatePassVisitor getGatePassVisitorList(@RequestParam("gatepassVisitorId") int gatepassVisitorId) {

		GatePassVisitor list = new GatePassVisitor();
		try {

			list = gatePassVisitorRepository.findByGatepassVisitorIdAndDelStatusOrderByGatepassVisitorIdDesc(gatepassVisitorId,1);

		} catch (Exception e) {

			e.printStackTrace();
		}

		return list;

	}

	@RequestMapping(value = { "/deleteGatePassVisitor" }, method = RequestMethod.POST)
	public @ResponseBody Info deleteGatePassVisitor(@RequestParam("gatepassVisitorId") int gatepassVisitorId) {

		Info info = new Info();

		try {

			int delete = gatePassVisitorRepository.deleteGatePassVisitor(gatepassVisitorId);

			if (delete > 0) {
				info.setError(false);
				info.setMsg("deleted");
			} else {
				info.setError(true);
				info.setMsg("failed");
			}

		} catch (Exception e) {

			e.printStackTrace();
			info.setError(true);
			info.setMsg("failed");
		}

		return info;

	}
	
}
