package cart;

public class CartPOJO {
	String image,qnty,pr_id,pr_nm,pr_prc;

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public String getQnty() {
		return qnty;
	}

	public void setQnty(String qnty) {
		this.qnty = qnty;
	}

	public String getPr_id() {
		return pr_id;
	}

	public void setPr_id(String pr_id) {
		this.pr_id = pr_id;
	}

	public String getPr_nm() {
		return pr_nm;
	}

	public void setPr_nm(String pr_nm) {
		this.pr_nm = pr_nm;
	}

	public String getPr_prc() {
		return pr_prc;
	}

	public void setPr_prc(String pr_prc) {
		this.pr_prc = pr_prc;
	}

	public CartPOJO(String image, String qnty, String pr_id, String pr_nm, String pr_prc) {
		super();
		this.image = image;
		this.qnty = qnty;
		this.pr_id = pr_id;
		this.pr_nm = pr_nm;
		this.pr_prc = pr_prc;
	}
	public double  gettotalPrice()
	{
		double t_prc=0;
		t_prc=Double.parseDouble(pr_prc)*Integer.parseInt(qnty);
		return t_prc;
		
	}
	public double withShipmentCharge()
	{
		double grand_ttl=0;
		double ship=300;
		grand_ttl=(Double.parseDouble(pr_prc)*Integer.parseInt(qnty))+ship;
		return grand_ttl;
	}

	public CartPOJO() {
		super();
		// TODO Auto-generated constructor stub
	}
	
		
	}

