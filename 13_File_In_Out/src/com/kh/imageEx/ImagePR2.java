package com.kh.imageEx;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class ImagePR2 {
/*
 바탕화면에 이미지폴더 / 동물이름.txt 파일 만들어준 후
 	동물이름 소 고양이 돼지 토끼 호랑이 이름을 \n 작성해서 만들어주고
 	동물 이름을 만들어 준 다음에 
 	좋아하는 동물 이름으로 폴더 이름을 변경한 다음
 	삭제하기
*/
	public static void main(String[] args) {
		String 폴더경로 = System.getProperty("user.home")+"/Desktop";
							   //		폴더명을 작성할 때마다 /가 존재하는지 확인
		File 이미지폴더 = new File(폴더경로 + "/이미지폴더");
		이미지폴더.mkdir();//이미지폴더 1개 작성
		
		//동물이름.txt 파일 생성 후 동물이름 작성
		
		try {
			
			FileWriter 글쓰기 = new FileWriter(이미지폴더+"/동물이름.txt");
			
			글쓰기.write("소\n고양이\n돼지\n토끼\n호랑이");
			System.out.println("동물이름 파일에 이름이 작성되었습니다.");
			글쓰기.close(); //작업하고 난 후에 항상 작업하던 파일을 닫아줄 것
			//글쓰기 작업이 완료되었습니다
			//좋아한느 동물이름으로 폴더 이름 변경
			//FileWriter는 글쓰는건 편리하지만 파일의 이름을 비교하거나 다른 작업은 하기 어려움
			File 원본파일 = new File(이미지폴더 + "/동물이름.txt");
			File 새로운파일 = new File(이미지폴더 + "/좋아하는동물이름.txt");
			
			if(원본파일.renameTo(새로운파일)) {
			System.out.println("파일 이름이 성공적으로 변경되었습니다.");
				
			}else {
				System.out.println("파일이름 변경 실패했습니다.");
			}
			
			File[] 파일목록 = 이미지폴더.listFiles();
			System.out.println("폴더 안에 파일 목록 보기 : " +파일목록);
			
			//for-each
			for(File f : 파일목록) {
				System.out.println(f.getName());
			
			}
			원본파일.delete();
			새로운파일.delete();
			if(이미지폴더.delete()) {
				System.out.println("폴더가 성공적으로 삭제되었습니다.");
			}else {
				System.out.println("폴더 삭제에 실패했씁니다.");
			}
			
		}catch(IOException e) {
			System.out.println("동물 이름 작성하는데 문제가 발생했습니다.");
			e.printStackTrace();
		}

		
	}
}
