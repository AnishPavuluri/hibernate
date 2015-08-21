package action;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import service.InterviewService;
import service.QuestionService;

import com.opensymphony.xwork2.ActionSupport;

import dto.Answear;
import dto.Interview;
import dto.Question;
import form.AnswearForm;

public class ExamAction extends ActionSupport implements SessionAware {
	private String studentName;
	private List<AnswearForm> answearForms;
	private InterviewService interviewService;
	private Interview interview;
	private QuestionService questionService;
	private List<Question> questions;
	private Map<String, Object> session;
	
	public String checkStudent(){
		interviewService = new InterviewService();
		interview = interviewService.findInterViewerByName(studentName);
		questionService = new QuestionService();
		questions = questionService.findQuestion();
		session.put("que", questions);
		return SUCCESS;
	}
	
	public String saveMarks(){
		List<String> checkBoxList; 
		Short m = 0;
		questions = (List<Question>) session.get("que");
		for(Question q : questions){
			for(AnswearForm a : answearForms){
				checkBoxList = new ArrayList<String>();
				if(q.getId().equals(a.getQuestionId())){
					for(Answear ans : q.getAnswears()){
						if(q.getType().equalsIgnoreCase("S") && ans.getAns() && ans.getId().toString().equals(a.getAnswearsByUser()[0])){
							for(String s: a.getAnswearsByUser()){
								if(ans.getId().toString().equals(s)){
									m++;
								}
							}
						}else {
							if(ans.getAns()){
								checkBoxList.add(ans.getId().toString());
							}
						}
					}
					if(q.getType().equalsIgnoreCase("M") && checkBoxList.size() == a.getAnswearsByUser().length && checkBoxList.containsAll(Arrays.asList(a.getAnswearsByUser()))){
						m++;
					}
				}
			}
		}
		interview = new Interview();
		interview.setMarks(m);
		interviewService = new InterviewService();
		interviewService.updateInterviewMarks(studentName, m);
		return SUCCESS;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public InterviewService getInterviewService() {
		return interviewService;
	}

	public void setInterviewService(InterviewService interviewService) {
		this.interviewService = interviewService;
	}

	public Interview getInterview() {
		return interview;
	}

	public void setInterview(Interview interview) {
		this.interview = interview;
	}

	public QuestionService getQuestionService() {
		return questionService;
	}

	public void setQuestionService(QuestionService questionService) {
		this.questionService = questionService;
	}

	public List<Question> getQuestions() {
		return questions;
	}

	public void setQuestions(List<Question> questions) {
		this.questions = questions;
	}

	public List<AnswearForm> getAnswearForms() {
		return answearForms;
	}

	public void setAnswearForms(List<AnswearForm> answearForms) {
		this.answearForms = answearForms;
	}

	public Map<String, Object> getSession() {
		return session;
	}

	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

	
	
	
	
}
