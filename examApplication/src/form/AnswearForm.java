package form;

public class AnswearForm {
	private Short questionId;
	private String[] answearsByUser;

	public String[] getAnswearsByUser() {
		return answearsByUser;
	}

	public void setAnswearsByUser(String[] answearsByUser) {
		this.answearsByUser = answearsByUser;
	}

	public Short getQuestionId() {
		return questionId;
	}

	public void setQuestionId(Short questionId) {
		this.questionId = questionId;
	}

	

}
