/**
 * Figure 15.12 : FileChooserDemo.java
 * Demonstrating FileChooser
 */

 import java.io.IOException;
 import java.nio.file.DirectoryStream;
 import java.nio.file.Files;
 import java.nio.file.Path;
 import java.nio.file.Paths;
 import javax.swing.JFileChooser;
 import javax.swing.JFrame;
 import javax.swing.JOptionPane;
 import javax.swing.JScrollPane;
 import javax.swing.JTextArea;

public class FileChooserDemo extends JFrame {

    private final JTextArea outputArea;

    // set up GUI
    public FileChooserDemo() throws IOException
    {
        super("FileChooser Demo");
        outputArea = new JTextArea();
        add(new JScrollPane(outputArea)); // outputArea is scrollable
        analyzePath(); // get Path from user and display information
    }

    // Display informaition about file or directory user specifies
    public void analyzePath() throws IOException
    {
        Path path = getFileOrDirectoryPath();

        if (path != null && Files.exists(path))
        {
            // Gather file (or directory) information
            StringBuilder builder = new StringBuilder();
            builder.append(String.format("%s : \n", path.getFileName()));
            builder.append(String.format("%s a directory\n", Files.isDirectory(path) ? "is" : "is not" ));
            builder.append(String.format("%s is an absolute path", path.isAbsolute() ? "is" : "is not" ));
            builder.append(String.format("Last modified : %s\n", Files.getLastModifiedTime(path)));
            builder.append(String.format("Size : %s\n", Files.size(path)));
            builder.append(String.format("Path : %s\n", path));
            builder.append(String.format("Absolute Path : %s\n", path.toAbsolutePath()));

            if (Files.isDirectory(path)) // output directory
            {
                builder.append(String.format("\nDirectory Contents\n"));

                // Object for iterating througha directory's content
                DirectoryStream<Path> directoryStream = Files.newDirectoryStream(path);

                for (Path p : directoryStream)
                    builder.append(String.format("%s\n", p));
            }

            outputArea.setText(builder.toString());
        }
        else // Path does not exist
        {
            JOptionPane.showMessageDialog(this, path.getFileName() + " does not exist",
                    "ERROR", JOptionPane.ERROR_MESSAGE );
        }
    }

    // allow user to specify file or directory name
    private Path getFileOrDirectoryPath()
    {
        // Configure dialog allowing selection of a file or directory
        JFileChooser fileChooser = new JFileChooser();

        fileChooser.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);

        int result = fileChooser.showOpenDialog(this);

        // if user clicked Cancel button on dialog, return
        if (result == JFileChooser.CANCEL_OPTION)
            System.exit(1);

        // return Path representing the selected file
        return fileChooser.getSelectedFile().toPath();
    }
}
