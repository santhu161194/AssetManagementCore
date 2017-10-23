/*import java.util.Date;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.medplus.assetmanagementcore.dao.AssetDao;
import com.medplus.assetmanagementcore.dao.impl.AssetDaoImpl;
import com.medplus.assetmanagementcore.model.Asset;
import com.medplus.assetmanagementcore.utils.AssetStatusEnum;
import com.medplus.assetmanagementcore.utils.AssetTypeEnum;


public class AssertApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ApplicationContext context=new ClassPathXmlApplicationContext("com/medplus/assetmanagementcore/utils/ApplicationContext.xml");
AssetDaoImpl assertdao= context.getBean("assetdaoImpl",AssetDaoImpl.class);
Asset asset=context.getBean(Asset.class);
asset.setSerialNumber("45");
asset.setAssetName("hp");
asset.setAssetType(AssetTypeEnum.Laptop);
asset.setCost(19000.00);
asset.setStatus(AssetStatusEnum.Available);
int rows=assertdao.addAsset(asset,"10", new  java.sql.Date(new Date().getTime()));
if(rows>0)
	System.out.println("inserted");
else
System.out.println("not inserted");

int rows=assertdao.updateAssetStatus(1, AssetStatusEnum.NotAvailable,"13", new java.sql.Date(new Date().getTime() ));
if(rows>0)
	System.out.println("updated");
else
	System.out.println("not updated");
	}


}
*/