package com.medplus.assetmanagementcore.dao;

import java.sql.SQLException;
import java.util.Date;
import java.util.List;


import com.medplus.assetmanagementcore.model.Asset;
import com.medplus.assetmanagementcore.model.NewTypeRequest;
import com.medplus.assetmanagementcore.model.Request;
import com.medplus.assetmanagementcore.utils.AssetStatusEnum;
import com.medplus.assetmanagementcore.utils.AssetTypeEnum;

public interface AssetDao {


    public int addAsset(Asset asset,String createdBy,Date createdDate);
	
	public  int updateAsset(Asset asset,String updatedBy,Date updatedDate);
	
    public List<Asset> getAllAssets();
	
	public Asset getAsset(int assetId) ; 
	
	public  int updateAssetStatus(int assetId,AssetStatusEnum status,String ModifiedBy,Date dateModified);
	
	public List<Asset> getAssetByStatus(String status);//1
    
	public List<Asset> getEmployeeAssets(String empId);//2
	
	public List<NewTypeRequest> getNewAssetTypeRequests();
	
	public List<Request> getAllAssetRequests();
	
	public List<Request> getAssetRequests(String requestedBy);
	
	public int postAssetRequest(AssetTypeEnum assetType,String empId,Date requestedDate) throws SQLException;
	
	public int postNewAssetTypeRequest( String requestedBy,String assetType,String assetName,Date requestedDate)throws SQLException;
	
	public List<Request> getAssetRequestsByEmployee(String empId);
	
	
	public int allocateAsset(String assignedTo,int assetId,String asignedBy,Date handOverDate);
	
	public int deAllocateAsset(int assetId,String deallocatedBy,Date deallocateDate);
}