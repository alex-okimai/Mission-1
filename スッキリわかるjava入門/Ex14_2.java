package j14;

public class Ex14_2 {
	String accountNumber;
	int balance;
	public String toString() {
		return "$$" + this.balance + "(口座番号：" + this.accountNumber + ")";
	}
	public boolean equals(Object o) {
		if(this == o) {
			return true;
		}
		if(o instanceof Ex14_2) {
			Ex14_2 a = (Ex14_2) o;
			String an1 = this.accountNumber.trim();
			String an2 = this.accountNumber.trim();
			if(an1.equals(an2)) {
				return true;
			}
		}
		return false;
	}
}
