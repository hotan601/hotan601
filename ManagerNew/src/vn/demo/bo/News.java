package vn.demo.bo;

public class News {
	public int id;
	public int category_id;
	public String name;
	public String description;
	public String detail;
	public String image;
	public int date;
	public int user_id;
	
	public News (int id, int category_id, String name, String description, String detail, String image, int date, int user_id) {
		this.id = id;
		this.category_id = category_id;
		this.name = name;
		this.description = description;
		this.detail = detail;
		this.image = image;
		this.date = date;
		this.user_id = user_id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getCategory_id() {
		return category_id;
	}

	public void setCategory_id(int category_id) {
		this.category_id = category_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getDetail() {
		return detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public int getDate() {
		return date;
	}

	public void setDate(int date) {
		this.date = date;
	}

	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	
}
