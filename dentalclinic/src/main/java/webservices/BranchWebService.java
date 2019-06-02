package webservices;

import java.util.List;

import javax.jws.WebService;

import model.Branch;
@WebService(endpointInterface="webservices.IWebServiceBranch")
public class BranchWebService implements IWebServiceBranch {

	@Override
	public void AddBranch(Branch branch) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteBranch(int branchId) {
		// TODO Auto-generated method stub

	}

	@Override
	public void EditBranch(Branch branch) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<Branch> getAllBranch() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Branch getBranchById(int branchId) {
		// TODO Auto-generated method stub
		return null;
	}

}
