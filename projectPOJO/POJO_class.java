package projectPOJO;

public class POJO_class {
	private String s_id,s_name,s_date,s_price,s_qnty,s_dsc,s_img;
	public POJO_class() {
		
	}
	
	public POJO_class(String s_id, String s_name, String s_date, String s_price, String s_qnty, String s_dsc,
			String s_img) {
		super();
		this.s_id = s_id;
		this.s_name = s_name;
		this.s_date = s_date;
		this.s_price = s_price;
		this.s_qnty = s_qnty;
		this.s_dsc = s_dsc;
		this.s_img = s_img;
	}

	public String getS_img() {
		return s_img;
	}

	public void setS_img(String s_img) {
		this.s_img = s_img;
	}

	public String getS_id() {
		return s_id;
	}

	public void setS_id(String s_id) {
		this.s_id = s_id;
	}

	public String getS_name() {
		return s_name;
	}

	public void setS_name(String s_name) {
		this.s_name = s_name;
	}

	public String getS_date() {
		return s_date;
	}

	public void setS_date(String s_date) {
		this.s_date = s_date;
	}

	public String getS_price() {
		return s_price;
	}

	public void setS_price(String s_price) {
		this.s_price = s_price;
	}

	public String getS_qnty() {
		return s_qnty;
	}

	public void setS_qnty(String s_qnty) {
		this.s_qnty = s_qnty;
	}

	public String getS_dsc() {
		return s_dsc;
	}

	public void setS_dsc(String s_dsc) {
		this.s_dsc = s_dsc;
	}
	

}
