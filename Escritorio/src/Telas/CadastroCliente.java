package Telas;

import BeamFoto.ImagemBem;
import DAO.CONEXAO;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import jdk.jfr.Event;

public class CadastroCliente extends javax.swing.JInternalFrame {

    /*/Essas são as variaveis criadas no modulo de conexão, foram importadas para auxilar com o CRUD*/
    Connection conecta = null;
    PreparedStatement pst = null;
    ResultSet rs = null;

    int add, confirma, a, ad, mesAno = 12;

    public CadastroCliente() {
        initComponents();
        conecta = CONEXAO.con();

    }
    ImagemBem b = new ImagemBem();

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jSpinner1 = new javax.swing.JSpinner();
        jCheckBox1 = new javax.swing.JCheckBox();
        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        jTextField4 = new javax.swing.JTextField();
        jDialog1 = new javax.swing.JDialog();
        jToggleButton1 = new javax.swing.JToggleButton();
        buttonGroup4 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        foto = new javax.swing.JLabel();
        NomeCli = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        ApelidoCli = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        cpfCLI = new javax.swing.JFormattedTextField();
        jLabel4 = new javax.swing.JLabel();
        EstadoCivilCLI = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        PaiCli = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        MaeCli = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        DtNascimentoCli = new javax.swing.JFormattedTextField();
        jLabel8 = new javax.swing.JLabel();
        IdCli = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        SSpCLI = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        EmissaoCLi = new javax.swing.JFormattedTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        RecBeneficioCLI = new javax.swing.JComboBox<>();
        jLabel13 = new javax.swing.JLabel();
        CompanheiroCLI = new javax.swing.JTextField();
        RgCLI = new javax.swing.JFormattedTextField();
        ProfissaoCLI = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        Tel1CLI = new javax.swing.JFormattedTextField();
        jLabel15 = new javax.swing.JLabel();
        Tel2CLI = new javax.swing.JFormattedTextField();
        jLabel16 = new javax.swing.JLabel();
        EnderecoCLI = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        ObsCLI = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        NumCLI = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        IndicadorDoCLi = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        TIpoAcaoCLI = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        ObsCliAcao = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        ButtonEdit = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jCheckBox1.setText("jCheckBox1");

        jTextField4.setText("jTextField4");

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        jToggleButton1.setText("jToggleButton1");

        setClosable(true);
        setIconifiable(true);
        setTitle("CASDASTRO DE CLIENTE - ADVOGACIA");
        setMaximumSize(new java.awt.Dimension(600, 400));
        setMinimumSize(new java.awt.Dimension(600, 400));
        setPreferredSize(new java.awt.Dimension(600, 400));
        try {
            setSelected(true);
        } catch (java.beans.PropertyVetoException e1) {
            e1.printStackTrace();
        }
        setVerifyInputWhenFocusTarget(false);
        setVisible(true);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Dados Pessoais:", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));
        jPanel1.setToolTipText("Dados Pessoais:");
        jPanel1.setName("Dados Pessoais"); // NOI18N

        foto.setBackground(new java.awt.Color(0, 255, 255));
        foto.setOpaque(true);
        foto.setPreferredSize(new java.awt.Dimension(120, 120));
        foto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                fotoMouseClicked(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel1.setText("Nome: ");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel2.setText("Apelido:");

        ApelidoCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ApelidoCliActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel3.setText("CPF:");

        try {
            cpfCLI.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel4.setText("RG:");

        EstadoCivilCLI.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Estado Civil...", "Solteiro(a)", "Casado(a)", "Divorciado(a)", "Viúvo(a)" }));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel5.setText("Nome do Pai:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel6.setText("Nome da Mãe:");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel7.setText("DT Nascimento:");

        try {
            DtNascimentoCli.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel8.setText("Id:");

        IdCli.setEnabled(false);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel9.setText("SSP");

        SSpCLI.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SSP/UF - Secretaria de Segurança Pública da respectiva Unidade da Federação (UF)", "Cartório Civil - emite certidão de nascimento, casamento, óbito, etc.", "Polícia Federal - órgão responsável pela emissão de passaporte e outros serviços", "DETRAN - emissão de CNH (Carteira Nacional de Habilitação), CRLV (Certificado de Registro e Licenciamento de Veículos), etc.", "ABNC - Academia Brasileira de Neurocirurgia", "CGPI/DUREX/DPF - Coordenação Geral de Polícia de Imigração da Polícia Federal", "CGPI - Coordenação-Geral de Privilégios e Imunidades", "CGPMAF - Coordenadoria Geral de Polícia Marítima, Aeronáutica e de Fronteiras", "CNIG - Conselho Nacional de Imigração", "CNT - Confederação Nacional de Transporte", "COREN - Conselho Regional de Enfermagem", "CORECON - Conselho Regional de Economia", "CRA - Conselho Regional de Administração", "CRAS - Centro de Referência de Assistência Social", "CRB - Conselho Regional de Biblioteconomia", "CRC - Conselho Regional de Contabilidade", "CRE - Conselho Regional de Estatística", "CREA - Conselho Regional de Engenharia e Agronomia", "CRECI - Conselho Regional de Corretores de Imóveis", "CREFIT - Conselho Regional de Fisioterapia e Terapia Ocupacional", "CRESS - Conselho Regional de Serviço Social", "CRF - Conselho Regional de Farmácia", "CRM - Conselho Regional de Medicina", "CRN - Conselho Regional de Nutrição", "CRO - Conselho Regional de Odontologia", "CRP - Conselho Regional de Psicologia", "CRPRE - Conselho Regional de Profissionais de Relações Públicas", "CRQ - Conselho Regional de Química", "CRRC - Conselho Regional de Representantes Comerciais", "CRMV - Conselho Regional de Medicina Veterinária", "CSC - Carteira Sede Carpina de Pernambuco", "DIC - Diretoria de Identificação Civil", "DIREX - Diretoria-Executiva", "DPMAF - Divisão de Polícia Marítima, Área e de Fronteiras", "DPT - Departamento de Polícia Técnica Geral", "DST - Programa Municipal DST/Aids", "FGTS - Fundo de Garantia do Tempo de Serviço", "FIPE - Fundação Instituto de Pesquisas Econômicas", "FLS - Fundação Lyndolpho Silva", "GOVGO - Governo do Estado de Goiás", "I CLA - Carteira de Identidade Classista", "IFP - Instituto Félix Pacheco", "IGP - Instituto Geral de Perícias", "IICCECF/RO - Instituto de Identificação Civil e Criminal Engrácia da Costa Francisco de Rondônia", "IIMG - Inter-institutional Monitoring Group", "IML - Instituto Médico-Legal", "IPC - Índice de Preços ao Consumidor", "IPF - Instituto Pereira Faustino", "MAE - Ministério da Aeronáutica", "MEX - Ministério do Exército", "MMA - Ministério da Marinha", "MTE - Ministério do Trabalho e Emprego", "OAB - Ordem dos Advogados do Brasil", "OMB - Ordens dos Músicos do Brasil", "PCMG - Polícia Civil do Estado de Minas Gerais", "PMMG - Polícia Militar do Estado de Minas Gerais", "POF ou DPF - Polícia Federal", "POM - Polícia Militar", "SDS - Secretaria de Defesa Social (Pernambuco)", "SNJ - Secretaria Nacional de Justiça / Departamento de Estrangeiros", "SECC - Secretaria de Estado da Casa Civil", "SEJUSP - Secretaria de Estado de Justiça e Segurança Pública – Mato Grosso", "SES ou EST - Carteira de Estrangeiro", "SESP - Secretaria de Estado da Segurança Pública do Paraná", "SJS - Secretaria da Justiça e Segurança", "SJTC - Secretaria da Justiça do Trabalho e Cidadania", "SJTS - Secretaria da Justiça do Trabalho e Segurança", "SPTC - Secretaria de Polícia Técnico-Científica" }));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel10.setText("Emissão:");

        try {
            EmissaoCLi.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel11.setText("Profissão:");

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel12.setText("Recebe Beneficio:");

        RecBeneficioCLI.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nenhum", "APOSENTADORIA DA PESSOA COM DEFICIÊNCIA", "APOSENTADORIA ESPECIAL", "APOSENTADORIA POR IDADE", "APOSENTADORIA POR INVALIDEZ", "APOSENTADORIA POR TEMPO DE CONTRIBUIÇÃO", "AUXÍLIO-DOENÇA", "AUXÍLIO-ACIDENTE", "AUXÍLIO-RECLUSÃO", "BENEFÍCIO ASSISTENCIAL", "PENSÃO POR MORTE", "SALÁRIO-MATERNIDADE" }));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel13.setText("Esposo/Companheiro:");

        try {
            RgCLI.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("############-#")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(DtNascimentoCli, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(RecBeneficioCLI, 0, 474, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(PaiCli, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(MaeCli))
                            .addComponent(EstadoCivilCLI, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(RgCLI, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(SSpCLI, 0, 1, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(EmissaoCLi, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(6, 6, 6))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ProfissaoCLI, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CompanheiroCLI)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(foto, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(jLabel8)
                                .addGap(18, 18, 18)
                                .addComponent(IdCli, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(ApelidoCli, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addGap(35, 35, 35))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cpfCLI, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(NomeCli, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(220, 220, 220))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(IdCli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(ApelidoCli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(NomeCli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(cpfCLI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(foto, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addComponent(EstadoCivilCLI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(PaiCli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(MaeCli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel9)
                    .addComponent(SSpCLI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(EmissaoCLi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(RgCLI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(DtNascimentoCli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(RecBeneficioCLI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jLabel13)
                    .addComponent(CompanheiroCLI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ProfissaoCLI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Endereço / Contato"));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel14.setText("Telefone 1:");

        try {
            Tel1CLI.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) #####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel15.setText("Telefone 2:");

        try {
            Tel2CLI.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) #####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel16.setText("Endereço:");

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel17.setText("Observação:");

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel18.setText("Nº da Casa/Ap:");

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel19.setText("Indicação: ");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Tel1CLI, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Tel2CLI, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 4, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(EnderecoCLI))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel19)
                            .addComponent(IndicadorDoCLi, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel18)
                            .addComponent(NumCLI, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel17)
                            .addComponent(ObsCLI, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(24, 24, 24))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(Tel1CLI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15)
                    .addComponent(Tel2CLI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(EnderecoCLI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(jLabel18))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ObsCLI)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(NumCLI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel19)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(IndicadorDoCLi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Informações "));

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel20.setText("Tipo De Ação:");

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel21.setText("Observação:");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel20)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TIpoAcaoCLI))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel21)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(ObsCliAcao))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(TIpoAcaoCLI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel21)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ObsCliAcao)
                .addContainerGap())
        );

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Salvar.png"))); // NOI18N
        jButton1.setText("Salvar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        ButtonEdit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Edit.png"))); // NOI18N
        ButtonEdit.setText("Editar");
        ButtonEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonEditActionPerformed(evt);
            }
        });

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Sobre.png"))); // NOI18N
        jButton3.setText("Limpar Campos");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Excluir.png"))); // NOI18N
        jButton4.setText("Excluir");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Buscar.png"))); // NOI18N
        jButton5.setText("Consultar");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Relatorio.png"))); // NOI18N
        jButton2.setText("Imprimir");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ButtonEdit, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(15, 15, 15))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton1)
                        .addGap(18, 18, 18)
                        .addComponent(jButton5)
                        .addGap(18, 18, 18)
                        .addComponent(ButtonEdit)
                        .addGap(18, 18, 18)
                        .addComponent(jButton4)
                        .addGap(18, 18, 18)
                        .addComponent(jButton3)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(101, 101, 101))
        );

        setBounds(0, 0, 1000, 799);
    }// </editor-fold>//GEN-END:initComponents

    private void ApelidoCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ApelidoCliActionPerformed


    }//GEN-LAST:event_ApelidoCliActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        LimparCampos();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        CadastrarCLiente();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void ButtonEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonEditActionPerformed
        // Botão Editar: 
        Editar();
    }//GEN-LAST:event_ButtonEditActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        //Botão Excluir
        Excluir();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // Botão Consultar:
        Consultar();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // Botão Relatório
    }//GEN-LAST:event_jButton2ActionPerformed


    private void fotoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fotoMouseClicked

        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setCurrentDirectory(new File(System.getProperty("user.home")));
        int result = fileChooser.showOpenDialog(null);
        if (result == JFileChooser.APPROVE_OPTION) {
            File selectedFile = fileChooser.getSelectedFile();
            String nomeArquivo = selectedFile.getName();
            b.setNomeImage(selectedFile.getName());

            String pastaDestino = "src/fotoCliente";
            String caminhoDestino = pastaDestino + File.separator + nomeArquivo;
            Path source = selectedFile.toPath();
            Path target = Paths.get(caminhoDestino);
            b.setCaminho(target);
            b.setFilePath(caminhoDestino);
       
            
            try {
                Files.copy(source,  target, StandardCopyOption.REPLACE_EXISTING);
            } catch (IOException ex) {
                System.out.println("Erro ao copiar imagem: " + ex.getMessage());
            }

            String filePath = caminhoDestino;
            // lê a imagem e a redimensiona para se encaixar na label
            ImageIcon icon = new ImageIcon(filePath);
            icon.setDescription(b.getFilePath());
            int width = foto.getWidth();
            int height = foto.getHeight();
            Image image = icon.getImage();
            Image newImage = image.getScaledInstance(width, height, Image.SCALE_SMOOTH);
            icon = new ImageIcon(newImage);
            icon.setDescription(b.getFilePath());

            // atualiza a imagem da label
            foto.setIcon(icon);

        }
    }//GEN-LAST:event_fotoMouseClicked

    private void LimparCampos() {
        /**
         * Limpando os campos, dessa forma deixamos nosso software muito mais intuitivo.
         */
        IdCli.setText(null);
        NomeCli.setText(null);
        ApelidoCli.setText(null);
        cpfCLI.setText(null);
        EstadoCivilCLI.setSelectedItem(null);
        PaiCli.setText(null);
        MaeCli.setText(null);
        RgCLI.setText(null);
        SSpCLI.setSelectedItem(null);
        EmissaoCLi.setText(null);
        DtNascimentoCli.setText(null);
        RecBeneficioCLI.setSelectedItem(null);
        ProfissaoCLI.setText(null);
        CompanheiroCLI.setText(null);
        Tel1CLI.setText(null);
        Tel2CLI.setText(null);
        EnderecoCLI.setText(null);
        NumCLI.setText(null);
        IndicadorDoCLi.setText(null);
        ObsCLI.setText(null);
        TIpoAcaoCLI.setText(null);
        ObsCliAcao.setText(null);
        foto.setIcon(null);

    }

    @SuppressWarnings("empty-statement")
    private void CadastrarCLiente() {
        String sql = "insert into Clientes (nome_Clie,apelido_Clie, cpf_Clie,"
                + " estadoCivil_Clie, nome_Pai_Clie, nome_Mae_Clie, rg_Clie,"
                + " ssp_Clie, dt_Emissao, dat_Nasc, rcbBeneficio_Clie, prof_Clie,"
                + " nome_Comp_Clie,tel1_Clie, tel2_Clie, end_Clie, NumCadaClie,"
                + " indiq_Clie, obsEndereco_Clie, tipoAcao_Clie, Observacao, foto_Clie )"
                + " values ( ?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,? )  ";

        try {
            pst = conecta.prepareStatement(sql);
            /*Recebendo a String SQL*/

 /*Colocando os dados dos campos no BD:*/

            pst.setString(1, NomeCli.getText());
            pst.setString(2, ApelidoCli.getText());
            pst.setString(3, cpfCLI.getText());
            pst.setString(4, EstadoCivilCLI.getSelectedItem().toString());
            pst.setString(5, PaiCli.getText());
            pst.setString(6, MaeCli.getText());
            pst.setString(7, RgCLI.getText());
            pst.setString(8, SSpCLI.getSelectedItem().toString());

            //Esse cod é usado para colocar as datas no MySql
            String dia = EmissaoCLi.getText().substring(0, 2);
            String mes = EmissaoCLi.getText().substring(3, 5);
            String ano = EmissaoCLi.getText().substring(6);
            String MySql_Emissao = ano + "-" + mes + "-" + dia; // Essa variavel é responsavel por fazer a junção é por no bd da forma que é exigida.
            pst.setString(9, MySql_Emissao);

            String diaN = DtNascimentoCli.getText().substring(0, 2);
            String mesN = DtNascimentoCli.getText().substring(3, 5);
            String anoN = DtNascimentoCli.getText().substring(6);
            String MySql_Nascimento = anoN + "-" + mesN + "-" + diaN;
            pst.setString(10, MySql_Nascimento);

            pst.setString(11, RecBeneficioCLI.getSelectedItem().toString());
            pst.setString(12, ProfissaoCLI.getText());
            pst.setString(13, CompanheiroCLI.getText());
            pst.setString(14, Tel1CLI.getText());
            pst.setString(15, Tel2CLI.getText());
            pst.setString(16, EnderecoCLI.getText());
            pst.setString(17, NumCLI.getText());
            pst.setString(18, IndicadorDoCLi.getText());
            pst.setString(19, ObsCLI.getText());
            pst.setString(20, TIpoAcaoCLI.getText());
            pst.setString(21, ObsCliAcao.getText());
            pst.setString(22, b.getFilePath());
            
          


            if (NomeCli.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Preencha os campos obrigatorios");
            } else {
                // pst.executeUpdate();
                int add = pst.executeUpdate();//essa variavel é usada como parametro para atribuirmos as devidas alterações dentro da condição(if):
                add = 1;

                if (add > 0) {
                    JOptionPane.showMessageDialog(null, "Cliente Cadastrado!");
                    LimparCampos();
                }
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "ERRO:" + e);

        
        }
        /*catch(Exception e1){
            SQLIntegrityConstraintViolationException: Duplicate entry '777.777.777-77' for key 'clientes.cpf_Clie' 
            JOptionPane.showMessageDialog(null, "Erro: " + e1);
        }*/

    }

    private void Excluir() {

        int cofirmar = JOptionPane.showConfirmDialog(null, "Deseja excluir esse cliente", "Atenção", JOptionPane.YES_NO_OPTION);
        if (confirma == JOptionPane.YES_OPTION) {

            String sql = "delete from Clientes where cpf_Clie = ?";

            try {

                pst = conecta.prepareStatement(sql);
                pst.setString(1, cpfCLI.getText());
                pst.executeUpdate();

                int a = pst.executeUpdate();
                a = 1;

                if (a > 0) {
                    JOptionPane.showMessageDialog(null, "Cliente removido com sucesso!");
                    LimparCampos();
                }

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "ERRO: " + e);
            }

        }

    }

    private void Consultar() {

        String sql = "select * from Clientes where id_Clie = ? or cpf_Clie = ? ";
        String sql0 = "select date_format(dat_Nasc , '%d %m %Y') from Clientes";

        try {

            pst = conecta.prepareStatement(sql);
            pst.setString(1, IdCli.getText());
            pst.setString(2, cpfCLI.getText());

            rs = pst.executeQuery();

            if (rs.next()) {
                IdCli.setText(rs.getString(1));
                NomeCli.setText(rs.getString(2));
                ApelidoCli.setText(rs.getString(3));
                cpfCLI.setText(rs.getString(4));
                EstadoCivilCLI.setSelectedItem(rs.getString(5));
                PaiCli.setText(rs.getString(6));
                MaeCli.setText(rs.getString(7));
                RgCLI.setText(rs.getString(8));
                SSpCLI.setSelectedItem(rs.getString(9));
                
                String MySql_Emissao = rs.getString(10);
                String anoE = MySql_Emissao.substring(0, 4);
                String mesE = MySql_Emissao.substring(5, 7);
                String diaE = MySql_Emissao.substring(8);
                String Emissao = diaE + "/" + mesE +  "/" + anoE;
                 
               
                EmissaoCLi.setText(Emissao);
                
                String MySql_Nas = rs.getString(11);
                String anoNas = MySql_Nas.substring(0, 4);
                String mesNas = MySql_Nas.substring(5, 7);
                String diaNas = MySql_Nas.substring(8);
                String Nas = diaNas + "/" + mesNas +  "/" + anoNas;
                
                DtNascimentoCli.setText(Nas);
                
                RecBeneficioCLI.setSelectedItem(rs.getString(12));
                ProfissaoCLI.setText(rs.getString(13));
                CompanheiroCLI.setText(rs.getString(14));
                Tel1CLI.setText(rs.getString(15));
                Tel2CLI.setText(rs.getString(16));
                EnderecoCLI.setText(rs.getString(17));
                NumCLI.setText(rs.getString(18));
                IndicadorDoCLi.setText(rs.getString(19));
                ObsCLI.setText(rs.getString(20));
                TIpoAcaoCLI.setText(rs.getString(21));
                ObsCliAcao.setText(rs.getString(22));
                String fotinha = rs.getString(23);
                

                ImageIcon icon = new ImageIcon(fotinha);

                int largura = foto.getWidth();
                int altura = foto.getHeight();
                Image imagem = icon.getImage();

                Image novaImagem = imagem.getScaledInstance(largura, altura, Image.SCALE_SMOOTH);

                ImageIcon novaFoto = new ImageIcon(novaImagem);
                novaFoto.setDescription(fotinha);
                foto.setIcon(novaFoto);
                

                /*NomeCli.setText(rs.getString(1));
                    cpfCLI.setText(rs.getString(2));*/
            } else {

                JOptionPane.showMessageDialog(null, "Cliente não Cadastrado!");
                LimparCampos();

            }

        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, "ERRO:" + e);

        }

    }

    private void Editar() {

            if(foto.getIcon() != null){
            ImageIcon icone = (ImageIcon) foto.getIcon();
            b.setFilePath(icone.getDescription());
            }
            
        String sql = " update Clientes set nome_Clie= ?, apelido_Clie =?, estadoCivil_Clie = ?,"
                + " nome_Pai_Clie = ?, nome_Mae_Clie = ?, rg_Clie = ?, ssp_Clie = ?, dt_Emissao = ?,"
                + " dat_Nasc = ?, rcbBeneficio_Clie = ?, prof_Clie = ?, nome_Comp_Clie = ?,"
                + "tel1_Clie = ?, tel2_Clie = ?, end_Clie = ?, NumCadaClie = ?, indiq_Clie = ?,"
                + " obsEndereco_Clie = ?, tipoAcao_Clie = ?, Observacao = ?, foto_Clie = ?" 
                + " where cpf_Clie = ? ";

        try {

            pst = conecta.prepareStatement(sql); //Abrindo a conexão com o BD

            pst.setString(1, NomeCli.getText());
            pst.setString(2, ApelidoCli.getText());
            pst.setString(3, EstadoCivilCLI.getSelectedItem().toString());
            pst.setString(4, PaiCli.getText());
            pst.setString(5, MaeCli.getText());
            pst.setString(6, RgCLI.getText());
            pst.setString(7, SSpCLI.getSelectedItem().toString());
              //Esse cod é usado para colocar as datas no MySql
            String dia = EmissaoCLi.getText().substring(0, 2);
            String mes = EmissaoCLi.getText().substring(3, 5);
            String ano = EmissaoCLi.getText().substring(6);
            String MySql_Emissao = ano + "-" + mes + "-" + dia; // Essa variavel é responsavel por fazer a junção é por no bd da forma que é exigida.
            pst.setString(8, MySql_Emissao);

            String diaN = DtNascimentoCli.getText().substring(0, 2);
            String mesN = DtNascimentoCli.getText().substring(3, 5);
            String anoN = DtNascimentoCli.getText().substring(6);
            String MySql_Nascimento = anoN + "-" + mesN + "-" + diaN;
            pst.setString(9, MySql_Nascimento);
            pst.setString(10, RecBeneficioCLI.getSelectedItem().toString());
            pst.setString(11, ProfissaoCLI.getText());
            pst.setString(12, CompanheiroCLI.getText());
            pst.setString(13, Tel1CLI.getText());
            pst.setString(14, Tel2CLI.getText());
            pst.setString(15, EnderecoCLI.getText());
            pst.setString(16, NumCLI.getText());
            pst.setString(17, IndicadorDoCLi.getText());
            pst.setString(18, ObsCLI.getText());
            pst.setString(19, TIpoAcaoCLI.getText());
            pst.setString(20, ObsCliAcao.getText());
            pst.setString(21, b.getFilePath());
            pst.setString(22, cpfCLI.getText());
           

            if (cpfCLI.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Preencha o CPF");
            } else {

                int ad = pst.executeUpdate();
                ad = 1;

                if (ad > 0) {
                    JOptionPane.showMessageDialog(null, "Dados alterados com sucesso!");
                    LimparCampos();
                }

            }

        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, "ERRO: " + e);
            e.printStackTrace();
        }

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ApelidoCli;
    private javax.swing.JButton ButtonEdit;
    private javax.swing.JTextField CompanheiroCLI;
    private javax.swing.JFormattedTextField DtNascimentoCli;
    private javax.swing.JFormattedTextField EmissaoCLi;
    private javax.swing.JTextField EnderecoCLI;
    private javax.swing.JComboBox<String> EstadoCivilCLI;
    public javax.swing.JTextField IdCli;
    private javax.swing.JTextField IndicadorDoCLi;
    private javax.swing.JTextField MaeCli;
    private javax.swing.JTextField NomeCli;
    private javax.swing.JTextField NumCLI;
    private javax.swing.JTextField ObsCLI;
    private javax.swing.JTextField ObsCliAcao;
    private javax.swing.JTextField PaiCli;
    private javax.swing.JTextField ProfissaoCLI;
    private javax.swing.JComboBox<String> RecBeneficioCLI;
    private javax.swing.JFormattedTextField RgCLI;
    private javax.swing.JComboBox<String> SSpCLI;
    private javax.swing.JTextField TIpoAcaoCLI;
    private javax.swing.JFormattedTextField Tel1CLI;
    private javax.swing.JFormattedTextField Tel2CLI;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.JFormattedTextField cpfCLI;
    public javax.swing.JLabel foto;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JToggleButton jToggleButton1;
    // End of variables declaration//GEN-END:variables
}
