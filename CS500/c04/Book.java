public class Book
{
    String title,author,publisher,copyright;
    public Book(String title, String author, String publisher, String copyright)
    {
        title=title;
        author=author;
        publisher=publisher;
        copyright=copyright;        
    }
    
    public void setTitle(String newTitle)
    {
        title=newTitle;
    }
    
    public void setAuthor(String newAuthor)
    {
        author=newTitle;
    }
    
    public void setPublisher(String newPublisher)
    {
        publisher=newPublisher;
    }
    
    public void setCopyright(String newCopyright)
    {
        copyright=newCopyright;
    }
    
    public String getTitle()
    {
        return title;
    }
    
    public String getAuthor()
    {
        return author;
    }
    
    public String getPublisher()
    {
        return publisher;
    }
    
    public String getCopyright()
    {
        return copyright;
    }

}