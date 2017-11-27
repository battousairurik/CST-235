package authenticationForms;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

import projectBeans.CreditCardBean;

public class CreditCardAuthentication {

	ArrayList<CreditCardBean> beanList = new ArrayList<CreditCardBean>();
	
	public CreditCardAuthentication(){
		readFile("src\\CreditCardList.txt");
	}
	
	private void readFile (String filePath){
		File file = new File(filePath);
		try {
			Scanner inputstream =new Scanner (file);
			while (inputstream.hasNext()){
				String data = inputstream.nextLine();
				String [] splitData = data.split(",");
				String data2 = inputstream.nextLine();
				String [] splitData2 = data2.split(",");
				CreditCardBean bean = new CreditCardBean();
				bean.setFirstName(splitData[0]);
				bean.setLastName(splitData[1]);
				bean.setStreetAddress(splitData[2]);
				bean.setCity(splitData[3]);
				bean.setState(splitData[4]);
				bean.setZipcode(Integer.parseInt(splitData[5]));
				bean.setCreditCardNumber(Integer.parseInt(splitData2[0]));
				bean.setSecurityCode(Integer.parseInt(splitData2[1]));
				bean.setExpirationDate(Integer.parseInt(splitData2[2]));
			}
			inputstream.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public boolean authenticateBean (CreditCardBean bean){
		boolean authenticBean = false;
		
		for (CreditCardBean cardBean : beanList){
			if (bean.getFirstName() != cardBean.getFirstName()) continue;
			if (bean.getLastName() != cardBean.getLastName()) continue;
			if (bean.getStreetAddress() != cardBean.getStreetAddress()) continue;
			if (bean.getState() != cardBean.getState()) continue;
			if (bean.getZipcode() != cardBean.getZipcode()) continue;
			if (bean.getCreditCardNumber() != cardBean.getCreditCardNumber()) continue;
			if (bean.getSecurityCode() != cardBean.getSecurityCode()) continue;
			if (bean.getExpirationDate() != cardBean.getExpirationDate()) continue;
			authenticBean = true;
			break;
		}
		
		return authenticBean;
	}
}
