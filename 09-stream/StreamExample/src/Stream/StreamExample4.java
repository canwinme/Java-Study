package Stream;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.Path;
import java.util.stream.Stream;

public class StreamExample4 {

	public static void main(String[] args) throws Exception {
		Path path = Paths.get(StreamExample4.class.getResource("data.txt").toURI());
		Stream<String> stream = Files.lines(path, Charset.defaultCharset());
		stream.forEach(line->System.out.println(line));
		stream.close();
	}

}
