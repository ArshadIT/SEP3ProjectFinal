package webservices;

import java.util.List;

import javax.jws.WebService;

import controller.BranchController;
import controller.IBranchController;
import model.Branch;

@WebService(endpointInterface = "webservices.IWebServiceBranch")
public class BranchWebService implements IWebServiceBranch {
	private IBranchController branchcon;

	public BranchWebService() {

		branchcon = new BranchController();
	}

	@Override
	public void AddBranch(Branch branch) {
		branchcon.AddBranch(branch);
	}

	@Override
	public void deleteBranch(int branchId) {
		branchcon.deleteBranch(branchId);
	}

	@Override
	public void EditBranch(Branch branch) {
		branchcon.EditBranch(branch);
	}

	@Override
	public List<Branch> getAllBranch() {
		// TODO Auto-generated method stub
		return branchcon.getAllBranch();
	}

	@Override
	public Branch getBranchById(int branchId) {
		// TODO Auto-generated method stub
		return branchcon.getBranchById(branchId);
	}

}
