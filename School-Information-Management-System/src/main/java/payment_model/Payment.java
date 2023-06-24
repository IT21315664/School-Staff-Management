package payment_model;



public class Payment {
		protected int id;
		protected String name;
		protected String email;
		protected String grade;
		protected String amount;
		protected String date;
		protected String status;
		
		public Payment() {
			
		}

		
		
		public Payment(String name, String email,String grade, String amount, String date, String status) {
			super();
			this.name = name;
			this.email = email;
			this.grade = grade;
			this.amount = amount;
			this.date = date;
			this.status = status;
		}



		public Payment(int id, String name, String email, String grade, String amount, String date, String status) {
			super();
			this.id = id;
			this.name = name;
			this.email = email;
			this.grade = grade;
			this.amount = amount;
			this.date = date;
			this.status = status;
		}



		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public String getGrade() {
			return grade;
		}

		public void setGrade(String grade) {
			this.grade = grade;
		}

		public String getAmount() {
			return amount;
		}

		public void setAmount(String amount) {
			this.amount = amount;
		}

		public String getDate() {
			return date;
		}

		public void setDate(String date) {
			this.date = date;
		}

		public String getStatus() {
			return status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		
	}

		


		
