package sign_pojo;

public class POJO_Acct {
	private String fst_name,lst_name,address,phn,userNm,psrwd;

	public String getFst_name() {
		return fst_name;
	}

	public void setFst_name(String fst_name) {
		this.fst_name = fst_name;
	}

	public String getLst_name() {
		return lst_name;
	}

	public void setLst_name(String lst_name) {
		this.lst_name = lst_name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhn() {
		return phn;
	}

	public void setPhn(String phn) {
		this.phn = phn;
	}

	public String getUserNm() {
		return userNm;
	}

	public void setUserNm(String userNm) {
		this.userNm = userNm;
	}

	public String getPsrwd() {
		return psrwd;
	}

	public void setPsrwd(String psrwd) {
		this.psrwd = psrwd;
	}

	public POJO_Acct(String fst_name, String lst_name, String address, String phn, String userNm, String psrwd) {
		super();
		this.fst_name = fst_name;
		this.lst_name = lst_name;
		this.address = address;
		this.phn = phn;
		this.userNm = userNm;
		this.psrwd = psrwd;
	}
	

}
