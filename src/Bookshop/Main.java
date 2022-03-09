package Bookshop;
public class Main 
{

   public static void main(String args[]) {
       
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) 
        {
            java.util.logging.Logger.getLogger(Bookshop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() 
        {
            @Override
            public void run()
            {
                Loginpage lg=new Loginpage();
                lg.setTitle("LOGIN PAGE");
                lg.setVisible(true);
                
                
                /*Bookshop b=new Bookshop();
                b.initiate();
                b.setVisible(true);*/
            
            }
        });
        
        
        
    }

    
}
