package com.ef;

public class Department {
		private int dept_id;
		private String Computers;
		private String Health;
		private String Finance;
		public void getDepartmentInfo() {
			System.out.println("Id = "+this.dept_id+" Computers = "+this.Computers+" Health = "+this.Health+" Finance = "+this.Finance);
		}
		public int getDept_id() {
			return dept_id;
		}
		public void setDept_id(int dept_id) {
			this.dept_id = dept_id;
		}
		public String getComputers() {
			return Computers;
		}
		public void setComputers(String computers) {
			Computers = computers;
		}
		public String getHealth() {
			return Health;
		}
		public void setHealth(String health) {
			Health = health;
		}
		public String getFinance() {
			return Finance;
		}
		public void setFinance(String finance) {
			Finance = finance;
		}

}
