package tp15.files;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.Iterator;
import java.util.List;

public class TestFilesNIO {

	public static void main(String[] args) {

		System.out.println(System.getProperty("file.separator"));
		Path path = Paths.get("C:\\Users\\formation\\Documents\\tp_java\\donnees_communes.csv");
	
				
		System.out.println(path.getRoot());
		System.out.println(path.getParent());
		System.out.println(path.getFileName());
		
		boolean estFichier = Files.isRegularFile(path);
		
		if(estFichier) {
			System.out.println("cest un fichier");
			
		}
		
		boolean estLisible = Files.isReadable(path);
		
		
		if(estLisible) {
			System.out.println("il est lisible");
			
			boolean estRepertoire = Files.isDirectory(path);
			if(estRepertoire) {
				System.out.println("cest un repertoire");
			}else{
				System.out.println("ce nest pas un repertoire");
			}
			
		
			Path pathDestinationCopy = Paths.get("C:\\Users\\formation\\Documents\\tp_java\\donnees_communes_copy.csv");
			try {
			
			Files.copy(path,pathDestinationCopy);
			
			 
			}catch(IOException e) {
				System.out.println("pb avec la copie de fichier");
				e.printStackTrace();
			}finally {
				System.out.println("ona essay? une copie");
				try {
					Files.copy(path, pathDestinationCopy, StandardCopyOption.REPLACE_EXISTING);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}

			Path pathDestination = Paths.get("C:\\Users\\formation\\Documents\\tp_java\\donnees_communes_move.csv");
			
			Path pathDestinationMove= Paths.get("C:\\Users\\formation\\Documents\\tp_java\\donnees_communes_move.csv");
			
			//parcours d'un r?pertoire
			
			Path pathDirectory = Paths.get("C:\\Users\\formation\\Documents\\tp_java");
			try {
				DirectoryStream<Path> stream = Files.newDirectoryStream(pathDirectory);
				Iterator<Path> iterator = stream.iterator();
				while(iterator.hasNext()) {
					Path pathOfDirectory=iterator.next();
					System.out.println(pathOfDirectory);}
			}catch (IOException e) {
				e.printStackTrace();}
				}
		
		try {
			List<String> lines = Files.readAllLines(pathDestinationMove);
			for (String line : lines) {
				System.out.println(lines);
			}}catch(IOException e) {
				e.printStackTrace();}	
			
	//?criture dans un fichier
		
		try {
			List<String>lines=new ArrayList<>();
			lines.add("Bonjour");
			lines.add("le");
			lines.add("monde");
			Path pathToWrite=Paths.get()
		}
	
	
	}
			}
			
		
	
	

