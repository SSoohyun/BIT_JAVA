package hw1118;

class Members {
	private int userID;
	private String userName, email, phoneNo;
	private String userPwd, regDate;

	public Members(String userPwd, String userName, String email, String phoneNo) {
		this.userPwd = userPwd;
		this.userName = userName;
		this.email = email;
		this.phoneNo = phoneNo;
	}

	public Members(int userID, String userPwd, String userName, String email, String phoneNo, String regDate) {
		this(userPwd, userName, email, phoneNo);
		this.userID = userID;
		this.regDate = regDate;
	}

	public int getUserID() {
		return userID;
	}

	public void setUserID(int userID) {
		this.userID = userID;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	public String getUserPwd() {
		return userPwd;
	}

	public void setUserPwd(String userPwd) {
		this.userPwd = userPwd;
	}

	public String getRegDate() {
		return regDate;
	}

	public void setRegDate(String regDate) {
		this.regDate = regDate;
	}

	@Override
	public String toString() {
		return "Members [userID=" + userID + ", userName=" + userName + ", email=" + email + ", phoneNo=" + phoneNo
				+ ", userPwd=" + userPwd + ", regDate=" + regDate + "]";
	}
}
