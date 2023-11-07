package sample;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class GroupFileStorage {

	public static void saveGroupToCSV(Group gr) {
		String del = ",";
		File folder = new File("Group Storage/Group " + gr.getGroupName());
		boolean result = folder.mkdirs();
		File file = new File(folder, gr.getGroupName() + ".csv");

		try {
			file.createNewFile();
		} catch (Exception e) {
		}

		try (PrintWriter pw = new PrintWriter(file)) {
			Student[] student = gr.getStudents();
			pw.println("ID" + del + "Group name" + del + "Name" + del + "Last name" + del + "Gender");
			for (int i = 0; i < student.length; i++) {
				if (student[i] != null) {
					pw.print(student[i].getId() + del + student[i].getGroupName() + del + student[i].getName() + del
							+ student[i].getLastName() + del + student[i].getGender());
					pw.println();
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public static Group loadGroupFromCSV(File file) {

		Group group = new Group();
		group.setGroupName(file.getName().split("[.]")[0]);
		String[] result;
		String id = "ID";

		try {
			Scanner sc = new Scanner(file);
			for (; sc.hasNextLine();) {
				result = sc.nextLine().split("[,]");
				if (!(result[0].equals(id))) {
					Student student = new Student();
					student.setId(Integer.parseInt((result[0])));
					student.setGroupName(file.getName().split("[.]")[0]);
					student.setName(result[2]);
					student.setLastName(result[3]);
					if ((result[4].equals("Male"))) {
						student.setGender(Gender.MALE);
					} else {
						student.setGender(Gender.FEMALE);
					}
					try {
						group.addStudent(student);
					} catch (GroupOverflowException e) {
						e.printStackTrace();
					}
				}

			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		return group;
	}

	public static File findFileByGroupName(String groupName, File workFolder) throws FileNotFoundException {

		File[] files1 = workFolder.listFiles();
		File file = new File(".");

		for (int i = 0; i < files1.length; i++) {
			if (files1[i].getName().split("[.]")[0].equals("Group " + groupName)) {
				file = files1[i];
			}
		}

		File[] files2 = file.listFiles();

		for (int j = 0; j < files2.length; j++) {
			if (files2[j].getName().split("[.]")[0].equals(groupName)) {
				file = files2[j];
			}
		}
		return file;
	}
}

