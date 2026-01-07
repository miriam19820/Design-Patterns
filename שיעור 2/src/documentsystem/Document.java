package documentsystem;

import java.util.ArrayList;
public class Document implements Prototype {
	
	private String name;
    private String path;
    private long size;
    private ArrayList<String> content;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public long getSize() {
		return size;
	}

	public void setSize(long size) {
		this.size = size;
	}

	public ArrayList<String> getContent() {
		return content;
	}

	public void setContent(ArrayList<String> content) {
		this.content = content;
	}

	public Document(String name, String path, long size, ArrayList<String> content) {
		super();
		this.name = name;
		this.path = path;
		this.size = size;
		this.content = content;
	}

	@Override
	public Prototype createClone() {
		ArrayList<String> newContent = new ArrayList<>();
        for (String line : this.content) {
            newContent.add(line);
        }
		return new Document(this.name, this.path, this.size, newContent);
	}

	@Override
	public String toString() {
		return "Document [name=" + name + ", path=" + path + ", size=" + size + ", content=" + content + "]";
	}

	

}
