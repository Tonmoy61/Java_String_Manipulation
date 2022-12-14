/* Find out how many images are in the given array:
        ["photo1.jpg", "doc1.pdf", "doc2.docx", "photo2.png", "doc3.pdf", "msoffice.exe", "photo3.jpg"]
        Output: 3 */
package String_Manipulation;

public class File_Extension {
    public static void main(String[] args) {

        String[] photoArray = {"photo1.jpg", "doc1.pdf", "doc2.docx", "photo2.png", "doc3.pdf", "msoffice.exe", "photo3.jpg"};

        int count = 0;

        for( String result : photoArray){
            if(result.contains(".jpg")  || result.contains(".png") ){
                count += 1;
            }
        }
        System.out.println("your photo is: " + count);

    }
}
