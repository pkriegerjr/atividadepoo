public class main {
       public static void main(String[] args) {
        ProcessadordeDocumento docx = new ProcessadorDOCX();
        docx.processar();

        ProcessadordeDocumento pdf = new ProcessadorPDF();
        pdf.processar();
       }
    }
