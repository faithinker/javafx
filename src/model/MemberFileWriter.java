package model;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Calendar;

public class MemberFileWriter {
	BufferedWriter bw = null;
	FileWriter fw = null;
	public MemberFileWriter(File f) throws IOException {
		fw = new FileWriter(f);
	}
	public void saveMember(ArrayList<Member> memberList) {
		
		for(Member m : memberList) {
			try {
				fw.write(m.getEmail() + "\t");	// 필수
				fw.write(m.getPw() + "\t");		// 필수
				fw.write(m.getName() + "\t");	// 필수
				fw.write(m.getBirth() + "\t"); 	// 필수
				fw.write(m.getAge() + "\t");			// 자동 계산, 수정이 필요함
				fw.write(m.getAddress() + "\t");
				fw.write(m.getContact() + "\t");	
				fw.write(m.getGender() + "\t");
				//fw.write(m.getareaNum() + "\n");
				fw.flush();
			} catch (IOException e) {
			}			
		}
	}
}
