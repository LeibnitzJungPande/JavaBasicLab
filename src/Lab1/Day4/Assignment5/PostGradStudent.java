package Lab1.Day4.Assignment5;

public class PostGradStudent extends Student {
		int postCourseId;
		String postCourseName;
		int postCoursefees;
		public PostGradStudent(int pCourseId,String pCourseName,int pCourseFees,int sid,char sType,String sName) {
			super(sid,sType,sName);
			postCourseId=pCourseId;
			postCourseName=pCourseName;
			postCoursefees=pCourseFees;
		}
		int getpostCourseId() {
			return postCourseId;
		}
		String getpostCoursename() {
			return postCourseName;
		}
		int getpostCourseFees() {
			return postCoursefees;
		}
}
