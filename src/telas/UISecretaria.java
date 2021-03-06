/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package telas;

import POJO.Consulta;
import POJO.Paciente;
import POJO.Prontuario;
import POJO.DadosAdicionais;
import java.awt.CardLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import javax.swing.ButtonGroup;
import javax.swing.DefaultListModel;
import javax.swing.JCheckBox;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSplitPane;
import javax.swing.JTextField;
import sistema.Secretaria;
/**
 *
 * @author aleix
 */
public class UISecretaria extends javax.swing.JFrame {
    final CardLayout menu;
    final CardLayout opcoesSec;
    final DateTimeFormatter toBarras; 
    
    private List<Paciente> pacientes;
    private List<Consulta> consultas; 
    private ButtonGroup grupoAtualizarConvenio;
    private ButtonGroup grupoAtualizarTipoPlano;
    private ButtonGroup grupoTipoConsulta;
    Secretaria sec;
    /**
     * Creates new form secretaria
     */
    public UISecretaria() {
        initComponents();
        menu = (CardLayout) (cardMenu.getLayout());
        opcoesSec = (CardLayout) (cardOpcoesSecretaria.getLayout());
        opcoesSec.show(cardOpcoesSecretaria, "telaDefault");
        this.toBarras = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        this.grupoAtualizarConvenio = new javax.swing.ButtonGroup();
        this.grupoTipoConsulta = new javax.swing.ButtonGroup();
        this.grupoAtualizarTipoPlano = new javax.swing.ButtonGroup();
        //this.pacientes = new List<>();
        this.sec = new Secretaria();
        setSize(new Dimension(804, 600));
    }
    
    public UISecretaria(ArrayList<Paciente> pacientes, ArrayList<Consulta> consultas) {
        initComponents();
        menu = (CardLayout) (cardMenu.getLayout());
        this.toBarras = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        opcoesSec = (CardLayout) (cardOpcoesSecretaria.getLayout());
        opcoesSec.show(cardOpcoesSecretaria, "telaDefault");
        this.grupoAtualizarConvenio = new javax.swing.ButtonGroup();
        this.grupoAtualizarTipoPlano = new javax.swing.ButtonGroup();
        this.grupoTipoConsulta = new javax.swing.ButtonGroup();
        this.pacientes = pacientes;
        this.consultas = consultas;
        this.sec = new Secretaria();
        setSize(new Dimension(804, 600));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grupoConvenio = new javax.swing.ButtonGroup();
        filler3 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 0));
        jSplitPane2 = new javax.swing.JSplitPane();
        cardMenu = new javax.swing.JPanel();
        menuSecretaria = new javax.swing.JPanel();
        botaoVoltarMain = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        botaoRelatorio = new javax.swing.JButton();
        botaoPaciente = new javax.swing.JButton();
        botaoConsulta = new javax.swing.JButton();
        menuGerenciarPaciente = new javax.swing.JPanel();
        botaoVoltarSec = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        botaoRemover = new javax.swing.JButton();
        botaoAtualizar = new javax.swing.JButton();
        botaoCadastrar = new javax.swing.JButton();
        menuGerenciarConsulta = new javax.swing.JPanel();
        botaoVoltarCons = new javax.swing.JButton();
        jLabel19 = new javax.swing.JLabel();
        botaoMenuRemoverCons = new javax.swing.JButton();
        botaoMenuAtualizarCons = new javax.swing.JButton();
        botaoMenuCadastrarCons = new javax.swing.JButton();
        menuGerenciarRel = new javax.swing.JPanel();
        botaoVoltarRel = new javax.swing.JButton();
        jLabel32 = new javax.swing.JLabel();
        botaoMenuEmitirRelCons = new javax.swing.JButton();
        cardOpcoesSecretaria = new javax.swing.JPanel();
        telaDefault = new javax.swing.JPanel();
        cadastrarPaciente = new javax.swing.JPanel();
        painelCidade = new javax.swing.JPanel();
        cidadeField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        painelBairro = new javax.swing.JPanel();
        bairroField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        painelNome = new javax.swing.JPanel();
        nomeField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        painelRua = new javax.swing.JPanel();
        ruaField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        painelTelefone = new javax.swing.JPanel();
        telField = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        painelData = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        dataNascCalendar = new com.toedter.calendar.JDateChooser();
        painelConvenio = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        radioParticular = new javax.swing.JRadioButton();
        radioPlanodeSaude = new javax.swing.JRadioButton();
        filler4 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 32767));
        filler2 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 0));
        painelSalvar = new javax.swing.JPanel();
        botaoSalvarDados = new javax.swing.JButton();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 32767));
        filler5 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 32767));
        filler6 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 0));
        painelEmail = new javax.swing.JPanel();
        emailField = new javax.swing.JTextField();
        jLabel36 = new javax.swing.JLabel();
        atualizarPaciente = new javax.swing.JPanel();
        painelSelecionarPaciente = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        pacientesBox = new javax.swing.JComboBox();
        painelAtualizaCidade = new javax.swing.JPanel();
        atualizaCidadeField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        painelAtualizaBairro = new javax.swing.JPanel();
        atualizaBairroField = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        painelAtualizaNome = new javax.swing.JPanel();
        atualizaNomeField = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        painelAtualizaRua = new javax.swing.JPanel();
        atualizaRuaField = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        painelAtualizaTelefone = new javax.swing.JPanel();
        atualizaTelField = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        painelAtualizaData = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        atualizaDataNascCalendar = new com.toedter.calendar.JDateChooser();
        painelAtualizaConvenio = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        atualizaRadioParticular = new javax.swing.JRadioButton();
        atualizaRadioPlanodeSaude = new javax.swing.JRadioButton();
        painelAtualizar = new javax.swing.JPanel();
        botaoAtualizarDados = new javax.swing.JButton();
        painelAtualizaEmail = new javax.swing.JPanel();
        atualizaEmailField = new javax.swing.JTextField();
        jLabel35 = new javax.swing.JLabel();
        removerPaciente = new javax.swing.JPanel();
        painelExcluirPaciente = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listaPacientes = new javax.swing.JList<>();
        painelRemover = new javax.swing.JPanel();
        botaoRemoverPac = new javax.swing.JButton();
        cadastrarConsulta = new javax.swing.JPanel();
        painelHorario = new javax.swing.JPanel();
        horarioField = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        painelPacCons = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        pacientesBoxCons = new javax.swing.JComboBox();
        painelMedico = new javax.swing.JPanel();
        medicoField = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        painelDataCons = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        dataConsCalendar = new com.toedter.calendar.JDateChooser();
        painelTipoCons = new javax.swing.JPanel();
        jLabel26 = new javax.swing.JLabel();
        radioNormal = new javax.swing.JRadioButton();
        radioRetorno = new javax.swing.JRadioButton();
        painelSalvarCons = new javax.swing.JPanel();
        botaoSalvarCons = new javax.swing.JButton();
        atualizarConsulta = new javax.swing.JPanel();
        painelAtualizarHorario = new javax.swing.JPanel();
        atualizarHorarioField = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        painelSelecicionarCons = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        consBox = new javax.swing.JComboBox();
        painelAtualizarMedico = new javax.swing.JPanel();
        atualizarMedicoField = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        painelAtualizarDataCons = new javax.swing.JPanel();
        jLabel28 = new javax.swing.JLabel();
        atualizarDataConsCalendar = new com.toedter.calendar.JDateChooser();
        painelAtualizarTipoCons = new javax.swing.JPanel();
        jLabel29 = new javax.swing.JLabel();
        atualizarRadioNormal = new javax.swing.JRadioButton();
        atualizarRadioRetorno = new javax.swing.JRadioButton();
        painelBotaoAtualizarCons = new javax.swing.JPanel();
        botaoAtualizarCons = new javax.swing.JButton();
        painelNomePaciente = new javax.swing.JPanel();
        jLabel30 = new javax.swing.JLabel();
        nomePacienteConsField = new javax.swing.JTextField();
        removerConsulta = new javax.swing.JPanel();
        painelExcluirConsulta = new javax.swing.JPanel();
        jLabel31 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        listaCons = new javax.swing.JList<>();
        painelRemoverCons = new javax.swing.JPanel();
        botaoRemoverCons = new javax.swing.JButton();
        emitirRelatorioCons = new javax.swing.JPanel();
        painelEmitirRelCons = new javax.swing.JPanel();
        jLabel33 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        listaRelCons = new javax.swing.JList<>();
        JPanelDataChecks = new javax.swing.JPanel();
        consProximoDiaField = new javax.swing.JTextField();
        filler18 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 0));
        celularCheck = new javax.swing.JCheckBox();
        emailCheck = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        cardMenu.setPreferredSize(new java.awt.Dimension(226, 536));
        cardMenu.setLayout(new java.awt.CardLayout());

        menuSecretaria.setBackground(new java.awt.Color(204, 204, 204));

        botaoVoltarMain.setBackground(new java.awt.Color(204, 204, 204));
        botaoVoltarMain.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        botaoVoltarMain.setForeground(new java.awt.Color(51, 51, 51));
        botaoVoltarMain.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/botoes/default.png"))); // NOI18N
        botaoVoltarMain.setText("Voltar");
        botaoVoltarMain.setBorder(null);
        botaoVoltarMain.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botaoVoltarMain.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/botoes/pressed.png"))); // NOI18N
        botaoVoltarMain.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/botoes/hover.png"))); // NOI18N
        botaoVoltarMain.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/botoes/selected.png"))); // NOI18N
        botaoVoltarMain.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoVoltarMainvoltarMenuPrincipal(evt);
            }
        });

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icones/back.png"))); // NOI18N

        botaoRelatorio.setBackground(new java.awt.Color(204, 204, 204));
        botaoRelatorio.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        botaoRelatorio.setForeground(new java.awt.Color(51, 51, 51));
        botaoRelatorio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/botoes/default.png"))); // NOI18N
        botaoRelatorio.setText("Emitir Relat??rios");
        botaoRelatorio.setBorder(null);
        botaoRelatorio.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botaoRelatorio.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/botoes/pressed.png"))); // NOI18N
        botaoRelatorio.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/botoes/hover.png"))); // NOI18N
        botaoRelatorio.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/botoes/selected.png"))); // NOI18N
        botaoRelatorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoRelatorioActionPerformed(evt);
            }
        });

        botaoPaciente.setBackground(new java.awt.Color(204, 204, 204));
        botaoPaciente.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        botaoPaciente.setForeground(new java.awt.Color(51, 51, 51));
        botaoPaciente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/botoes/default.png"))); // NOI18N
        botaoPaciente.setText("Gerenciar Paciente");
        botaoPaciente.setBorder(null);
        botaoPaciente.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botaoPaciente.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/botoes/pressed.png"))); // NOI18N
        botaoPaciente.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/botoes/hover.png"))); // NOI18N
        botaoPaciente.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/botoes/selected.png"))); // NOI18N
        botaoPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoPacienteActionPerformed(evt);
            }
        });

        botaoConsulta.setBackground(new java.awt.Color(204, 204, 204));
        botaoConsulta.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        botaoConsulta.setForeground(new java.awt.Color(51, 51, 51));
        botaoConsulta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/botoes/default.png"))); // NOI18N
        botaoConsulta.setText("Gerenciar Consulta");
        botaoConsulta.setBorder(null);
        botaoConsulta.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botaoConsulta.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/botoes/pressed.png"))); // NOI18N
        botaoConsulta.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/botoes/hover.png"))); // NOI18N
        botaoConsulta.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/botoes/selected.png"))); // NOI18N
        botaoConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoConsultaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout menuSecretariaLayout = new javax.swing.GroupLayout(menuSecretaria);
        menuSecretaria.setLayout(menuSecretariaLayout);
        menuSecretariaLayout.setHorizontalGroup(
            menuSecretariaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuSecretariaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(menuSecretariaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(menuSecretariaLayout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(botaoVoltarMain, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(botaoRelatorio, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(botaoPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(botaoConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );
        menuSecretariaLayout.setVerticalGroup(
            menuSecretariaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuSecretariaLayout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addComponent(botaoPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 44, Short.MAX_VALUE)
                .addGap(58, 58, 58)
                .addComponent(botaoConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 44, Short.MAX_VALUE)
                .addGap(58, 58, 58)
                .addComponent(botaoRelatorio, javax.swing.GroupLayout.PREFERRED_SIZE, 44, Short.MAX_VALUE)
                .addGap(198, 198, 198)
                .addGroup(menuSecretariaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(botaoVoltarMain, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(16, 16, 16))
        );

        cardMenu.add(menuSecretaria, "menuSecretaria");

        menuGerenciarPaciente.setBackground(new java.awt.Color(204, 204, 204));

        botaoVoltarSec.setBackground(new java.awt.Color(204, 204, 204));
        botaoVoltarSec.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        botaoVoltarSec.setForeground(new java.awt.Color(51, 51, 51));
        botaoVoltarSec.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/botoes/default.png"))); // NOI18N
        botaoVoltarSec.setText("Voltar");
        botaoVoltarSec.setBorder(null);
        botaoVoltarSec.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botaoVoltarSec.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/botoes/pressed.png"))); // NOI18N
        botaoVoltarSec.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/botoes/hover.png"))); // NOI18N
        botaoVoltarSec.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/botoes/selected.png"))); // NOI18N
        botaoVoltarSec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoVoltarSecvoltarMenuPrincipal(evt);
            }
        });

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icones/back.png"))); // NOI18N

        botaoRemover.setBackground(new java.awt.Color(204, 204, 204));
        botaoRemover.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        botaoRemover.setForeground(new java.awt.Color(51, 51, 51));
        botaoRemover.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/botoes/default.png"))); // NOI18N
        botaoRemover.setText("Remover Paciente");
        botaoRemover.setBorder(null);
        botaoRemover.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botaoRemover.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/botoes/pressed.png"))); // NOI18N
        botaoRemover.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/botoes/hover.png"))); // NOI18N
        botaoRemover.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/botoes/selected.png"))); // NOI18N
        botaoRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoRemoverActionPerformed(evt);
            }
        });

        botaoAtualizar.setBackground(new java.awt.Color(204, 204, 204));
        botaoAtualizar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        botaoAtualizar.setForeground(new java.awt.Color(51, 51, 51));
        botaoAtualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/botoes/default.png"))); // NOI18N
        botaoAtualizar.setText("Atualizar Paciente");
        botaoAtualizar.setBorder(null);
        botaoAtualizar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botaoAtualizar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/botoes/pressed.png"))); // NOI18N
        botaoAtualizar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/botoes/hover.png"))); // NOI18N
        botaoAtualizar.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/botoes/selected.png"))); // NOI18N
        botaoAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoAtualizarActionPerformed(evt);
            }
        });

        botaoCadastrar.setBackground(new java.awt.Color(204, 204, 204));
        botaoCadastrar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        botaoCadastrar.setForeground(new java.awt.Color(51, 51, 51));
        botaoCadastrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/botoes/default.png"))); // NOI18N
        botaoCadastrar.setText("Cadastrar Paciente");
        botaoCadastrar.setBorder(null);
        botaoCadastrar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botaoCadastrar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/botoes/pressed.png"))); // NOI18N
        botaoCadastrar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/botoes/hover.png"))); // NOI18N
        botaoCadastrar.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/botoes/selected.png"))); // NOI18N
        botaoCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCadastrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout menuGerenciarPacienteLayout = new javax.swing.GroupLayout(menuGerenciarPaciente);
        menuGerenciarPaciente.setLayout(menuGerenciarPacienteLayout);
        menuGerenciarPacienteLayout.setHorizontalGroup(
            menuGerenciarPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuGerenciarPacienteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(menuGerenciarPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(menuGerenciarPacienteLayout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(botaoVoltarSec, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(botaoRemover, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(botaoCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(botaoAtualizar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );
        menuGerenciarPacienteLayout.setVerticalGroup(
            menuGerenciarPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuGerenciarPacienteLayout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addComponent(botaoCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58)
                .addComponent(botaoAtualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58)
                .addComponent(botaoRemover, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(198, 198, 198)
                .addGroup(menuGerenciarPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(botaoVoltarSec, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(16, 16, 16))
        );

        cardMenu.add(menuGerenciarPaciente, "menuGerenciarPaciente");

        menuGerenciarConsulta.setBackground(new java.awt.Color(204, 204, 204));

        botaoVoltarCons.setBackground(new java.awt.Color(204, 204, 204));
        botaoVoltarCons.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        botaoVoltarCons.setForeground(new java.awt.Color(51, 51, 51));
        botaoVoltarCons.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/botoes/default.png"))); // NOI18N
        botaoVoltarCons.setText("Voltar");
        botaoVoltarCons.setBorder(null);
        botaoVoltarCons.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botaoVoltarCons.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/botoes/pressed.png"))); // NOI18N
        botaoVoltarCons.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/botoes/hover.png"))); // NOI18N
        botaoVoltarCons.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/botoes/selected.png"))); // NOI18N
        botaoVoltarCons.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoVoltarConsvoltarMenuPrincipal(evt);
            }
        });

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icones/back.png"))); // NOI18N

        botaoMenuRemoverCons.setBackground(new java.awt.Color(204, 204, 204));
        botaoMenuRemoverCons.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        botaoMenuRemoverCons.setForeground(new java.awt.Color(51, 51, 51));
        botaoMenuRemoverCons.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/botoes/default.png"))); // NOI18N
        botaoMenuRemoverCons.setText("Remover Consulta");
        botaoMenuRemoverCons.setBorder(null);
        botaoMenuRemoverCons.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botaoMenuRemoverCons.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/botoes/pressed.png"))); // NOI18N
        botaoMenuRemoverCons.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/botoes/hover.png"))); // NOI18N
        botaoMenuRemoverCons.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/botoes/selected.png"))); // NOI18N
        botaoMenuRemoverCons.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoMenuRemoverConsActionPerformed(evt);
            }
        });

        botaoMenuAtualizarCons.setBackground(new java.awt.Color(204, 204, 204));
        botaoMenuAtualizarCons.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        botaoMenuAtualizarCons.setForeground(new java.awt.Color(51, 51, 51));
        botaoMenuAtualizarCons.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/botoes/default.png"))); // NOI18N
        botaoMenuAtualizarCons.setText("Atualizar Consulta");
        botaoMenuAtualizarCons.setBorder(null);
        botaoMenuAtualizarCons.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botaoMenuAtualizarCons.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/botoes/pressed.png"))); // NOI18N
        botaoMenuAtualizarCons.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/botoes/hover.png"))); // NOI18N
        botaoMenuAtualizarCons.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/botoes/selected.png"))); // NOI18N
        botaoMenuAtualizarCons.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoMenuAtualizarConsActionPerformed(evt);
            }
        });

        botaoMenuCadastrarCons.setBackground(new java.awt.Color(204, 204, 204));
        botaoMenuCadastrarCons.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        botaoMenuCadastrarCons.setForeground(new java.awt.Color(51, 51, 51));
        botaoMenuCadastrarCons.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/botoes/default.png"))); // NOI18N
        botaoMenuCadastrarCons.setText("Cadastrar Consulta");
        botaoMenuCadastrarCons.setBorder(null);
        botaoMenuCadastrarCons.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botaoMenuCadastrarCons.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/botoes/pressed.png"))); // NOI18N
        botaoMenuCadastrarCons.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/botoes/hover.png"))); // NOI18N
        botaoMenuCadastrarCons.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/botoes/selected.png"))); // NOI18N
        botaoMenuCadastrarCons.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoMenuCadastrarConsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout menuGerenciarConsultaLayout = new javax.swing.GroupLayout(menuGerenciarConsulta);
        menuGerenciarConsulta.setLayout(menuGerenciarConsultaLayout);
        menuGerenciarConsultaLayout.setHorizontalGroup(
            menuGerenciarConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuGerenciarConsultaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(menuGerenciarConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(menuGerenciarConsultaLayout.createSequentialGroup()
                        .addComponent(jLabel19)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(botaoVoltarCons, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(botaoMenuRemoverCons, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(botaoMenuCadastrarCons, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(botaoMenuAtualizarCons, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );
        menuGerenciarConsultaLayout.setVerticalGroup(
            menuGerenciarConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuGerenciarConsultaLayout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addComponent(botaoMenuCadastrarCons, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58)
                .addComponent(botaoMenuAtualizarCons, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58)
                .addComponent(botaoMenuRemoverCons, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(198, 198, 198)
                .addGroup(menuGerenciarConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(botaoVoltarCons, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19))
                .addGap(16, 16, 16))
        );

        botaoVoltarCons.getAccessibleContext().setAccessibleName("voltarCons");

        cardMenu.add(menuGerenciarConsulta, "menuGerenciarConsulta");

        menuGerenciarRel.setBackground(new java.awt.Color(204, 204, 204));

        botaoVoltarRel.setBackground(new java.awt.Color(204, 204, 204));
        botaoVoltarRel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        botaoVoltarRel.setForeground(new java.awt.Color(51, 51, 51));
        botaoVoltarRel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/botoes/default.png"))); // NOI18N
        botaoVoltarRel.setText("Voltar");
        botaoVoltarRel.setBorder(null);
        botaoVoltarRel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botaoVoltarRel.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/botoes/pressed.png"))); // NOI18N
        botaoVoltarRel.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/botoes/hover.png"))); // NOI18N
        botaoVoltarRel.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/botoes/selected.png"))); // NOI18N
        botaoVoltarRel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoVoltarRelvoltarMenuPrincipal(evt);
            }
        });

        jLabel32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icones/back.png"))); // NOI18N

        botaoMenuEmitirRelCons.setBackground(new java.awt.Color(204, 204, 204));
        botaoMenuEmitirRelCons.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        botaoMenuEmitirRelCons.setForeground(new java.awt.Color(51, 51, 51));
        botaoMenuEmitirRelCons.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/botoes/default.png"))); // NOI18N
        botaoMenuEmitirRelCons.setText("Emitir Relatorio de Consultas");
        botaoMenuEmitirRelCons.setBorder(null);
        botaoMenuEmitirRelCons.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botaoMenuEmitirRelCons.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/botoes/pressed.png"))); // NOI18N
        botaoMenuEmitirRelCons.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/botoes/hover.png"))); // NOI18N
        botaoMenuEmitirRelCons.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/botoes/selected.png"))); // NOI18N
        botaoMenuEmitirRelCons.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoMenuEmitirRelConsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout menuGerenciarRelLayout = new javax.swing.GroupLayout(menuGerenciarRel);
        menuGerenciarRel.setLayout(menuGerenciarRelLayout);
        menuGerenciarRelLayout.setHorizontalGroup(
            menuGerenciarRelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuGerenciarRelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(menuGerenciarRelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(menuGerenciarRelLayout.createSequentialGroup()
                        .addComponent(jLabel32)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(botaoVoltarRel, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(botaoMenuEmitirRelCons, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );
        menuGerenciarRelLayout.setVerticalGroup(
            menuGerenciarRelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuGerenciarRelLayout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addComponent(botaoMenuEmitirRelCons, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(402, 402, 402)
                .addGroup(menuGerenciarRelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(botaoVoltarRel, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel32))
                .addGap(16, 16, 16))
        );

        cardMenu.add(menuGerenciarRel, "menuRelatorioConsultas");

        jSplitPane2.setLeftComponent(cardMenu);

        cardOpcoesSecretaria.setMaximumSize(new java.awt.Dimension(1000, 1000));
        cardOpcoesSecretaria.setMinimumSize(new java.awt.Dimension(804, 582));
        cardOpcoesSecretaria.setLayout(new java.awt.CardLayout());

        telaDefault.setBackground(new java.awt.Color(51, 51, 51));

        javax.swing.GroupLayout telaDefaultLayout = new javax.swing.GroupLayout(telaDefault);
        telaDefault.setLayout(telaDefaultLayout);
        telaDefaultLayout.setHorizontalGroup(
            telaDefaultLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1089, Short.MAX_VALUE)
        );
        telaDefaultLayout.setVerticalGroup(
            telaDefaultLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 568, Short.MAX_VALUE)
        );

        cardOpcoesSecretaria.add(telaDefault, "telaDefault");

        cadastrarPaciente.setBackground(new java.awt.Color(51, 51, 51));
        cadastrarPaciente.setMaximumSize(new java.awt.Dimension(1000, 1000));
        cadastrarPaciente.setMinimumSize(new java.awt.Dimension(804, 568));

        painelCidade.setBackground(new java.awt.Color(51, 51, 51));

        cidadeField.setBackground(new java.awt.Color(255, 255, 255));
        cidadeField.setForeground(new java.awt.Color(51, 51, 51));

        jLabel1.setBackground(new java.awt.Color(204, 204, 204));
        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setText("Cidade");

        javax.swing.GroupLayout painelCidadeLayout = new javax.swing.GroupLayout(painelCidade);
        painelCidade.setLayout(painelCidadeLayout);
        painelCidadeLayout.setHorizontalGroup(
            painelCidadeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelCidadeLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelCidadeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cidadeField)
                    .addGroup(painelCidadeLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        painelCidadeLayout.setVerticalGroup(
            painelCidadeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelCidadeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cidadeField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        painelBairro.setBackground(new java.awt.Color(51, 51, 51));

        bairroField.setBackground(new java.awt.Color(255, 255, 255));
        bairroField.setForeground(new java.awt.Color(51, 51, 51));
        bairroField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bairroFieldActionPerformed(evt);
            }
        });

        jLabel2.setBackground(new java.awt.Color(204, 204, 204));
        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 204, 204));
        jLabel2.setText("Bairro");

        javax.swing.GroupLayout painelBairroLayout = new javax.swing.GroupLayout(painelBairro);
        painelBairro.setLayout(painelBairroLayout);
        painelBairroLayout.setHorizontalGroup(
            painelBairroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelBairroLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelBairroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bairroField)
                    .addGroup(painelBairroLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        painelBairroLayout.setVerticalGroup(
            painelBairroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelBairroLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bairroField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        painelNome.setBackground(new java.awt.Color(51, 51, 51));
        painelNome.setPreferredSize(new java.awt.Dimension(76, 55));

        nomeField.setBackground(new java.awt.Color(255, 255, 255));
        nomeField.setForeground(new java.awt.Color(51, 51, 51));

        jLabel3.setBackground(new java.awt.Color(204, 204, 204));
        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setText("Nome");

        javax.swing.GroupLayout painelNomeLayout = new javax.swing.GroupLayout(painelNome);
        painelNome.setLayout(painelNomeLayout);
        painelNomeLayout.setHorizontalGroup(
            painelNomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelNomeLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelNomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nomeField)
                    .addGroup(painelNomeLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        painelNomeLayout.setVerticalGroup(
            painelNomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelNomeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nomeField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        painelRua.setBackground(new java.awt.Color(51, 51, 51));

        ruaField.setBackground(new java.awt.Color(255, 255, 255));
        ruaField.setForeground(new java.awt.Color(51, 51, 51));

        jLabel5.setBackground(new java.awt.Color(204, 204, 204));
        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 204, 204));
        jLabel5.setText("Rua");

        javax.swing.GroupLayout painelRuaLayout = new javax.swing.GroupLayout(painelRua);
        painelRua.setLayout(painelRuaLayout);
        painelRuaLayout.setHorizontalGroup(
            painelRuaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelRuaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelRuaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ruaField)
                    .addGroup(painelRuaLayout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        painelRuaLayout.setVerticalGroup(
            painelRuaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelRuaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ruaField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        painelTelefone.setBackground(new java.awt.Color(51, 51, 51));

        telField.setBackground(new java.awt.Color(255, 255, 255));
        telField.setForeground(new java.awt.Color(51, 51, 51));

        jLabel7.setBackground(new java.awt.Color(204, 204, 204));
        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(204, 204, 204));
        jLabel7.setText("Telefone");

        javax.swing.GroupLayout painelTelefoneLayout = new javax.swing.GroupLayout(painelTelefone);
        painelTelefone.setLayout(painelTelefoneLayout);
        painelTelefoneLayout.setHorizontalGroup(
            painelTelefoneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelTelefoneLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelTelefoneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(telField, javax.swing.GroupLayout.DEFAULT_SIZE, 255, Short.MAX_VALUE)
                    .addGroup(painelTelefoneLayout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        painelTelefoneLayout.setVerticalGroup(
            painelTelefoneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelTelefoneLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(telField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        painelData.setBackground(new java.awt.Color(51, 51, 51));
        painelData.setPreferredSize(new java.awt.Dimension(76, 55));

        jLabel10.setBackground(new java.awt.Color(204, 204, 204));
        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(204, 204, 204));
        jLabel10.setText("Data de Nascimento");

        dataNascCalendar.setBackground(new java.awt.Color(255, 255, 255));
        dataNascCalendar.setDateFormatString("dd-MM-yyyy");
        dataNascCalendar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        javax.swing.GroupLayout painelDataLayout = new javax.swing.GroupLayout(painelData);
        painelData.setLayout(painelDataLayout);
        painelDataLayout.setHorizontalGroup(
            painelDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelDataLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelDataLayout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(dataNascCalendar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        painelDataLayout.setVerticalGroup(
            painelDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelDataLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(dataNascCalendar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        painelConvenio.setBackground(new java.awt.Color(51, 51, 51));

        jLabel11.setBackground(new java.awt.Color(204, 204, 204));
        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(204, 204, 204));
        jLabel11.setText("Tipo de Conv??nio");

        radioParticular.setBackground(new java.awt.Color(51, 51, 51));
        grupoConvenio.add(radioParticular);
        radioParticular.setForeground(new java.awt.Color(204, 204, 204));
        radioParticular.setText("Particular");
        radioParticular.setActionCommand("particular");
        radioParticular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioParticularActionPerformed(evt);
            }
        });

        radioPlanodeSaude.setBackground(new java.awt.Color(51, 51, 51));
        grupoConvenio.add(radioPlanodeSaude);
        radioPlanodeSaude.setForeground(new java.awt.Color(204, 204, 204));
        radioPlanodeSaude.setText("Plano de Sa??de");
        radioPlanodeSaude.setActionCommand("plano de sa??de");
        radioPlanodeSaude.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioPlanodeSaudeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painelConvenioLayout = new javax.swing.GroupLayout(painelConvenio);
        painelConvenio.setLayout(painelConvenioLayout);
        painelConvenioLayout.setHorizontalGroup(
            painelConvenioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelConvenioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelConvenioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelConvenioLayout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(painelConvenioLayout.createSequentialGroup()
                        .addComponent(radioParticular)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 78, Short.MAX_VALUE)
                        .addComponent(radioPlanodeSaude)))
                .addContainerGap())
        );
        painelConvenioLayout.setVerticalGroup(
            painelConvenioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelConvenioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11)
                .addGap(18, 18, 18)
                .addGroup(painelConvenioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radioParticular)
                    .addComponent(radioPlanodeSaude))
                .addContainerGap(11, Short.MAX_VALUE))
        );

        painelSalvar.setBackground(new java.awt.Color(51, 51, 51));

        botaoSalvarDados.setBackground(new java.awt.Color(204, 204, 204));
        botaoSalvarDados.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        botaoSalvarDados.setForeground(new java.awt.Color(51, 51, 51));
        botaoSalvarDados.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/botoes/default.png"))); // NOI18N
        botaoSalvarDados.setText("Salvar");
        botaoSalvarDados.setBorder(null);
        botaoSalvarDados.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botaoSalvarDados.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/botoes/pressed.png"))); // NOI18N
        botaoSalvarDados.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/botoes/hover.png"))); // NOI18N
        botaoSalvarDados.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/botoes/selected.png"))); // NOI18N
        botaoSalvarDados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoSalvarDadosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painelSalvarLayout = new javax.swing.GroupLayout(painelSalvar);
        painelSalvar.setLayout(painelSalvarLayout);
        painelSalvarLayout.setHorizontalGroup(
            painelSalvarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelSalvarLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(botaoSalvarDados, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        painelSalvarLayout.setVerticalGroup(
            painelSalvarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelSalvarLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(botaoSalvarDados, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        painelEmail.setBackground(new java.awt.Color(51, 51, 51));

        emailField.setBackground(new java.awt.Color(255, 255, 255));
        emailField.setForeground(new java.awt.Color(51, 51, 51));
        emailField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailFieldActionPerformed(evt);
            }
        });

        jLabel36.setBackground(new java.awt.Color(204, 204, 204));
        jLabel36.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(204, 204, 204));
        jLabel36.setText("Email");

        javax.swing.GroupLayout painelEmailLayout = new javax.swing.GroupLayout(painelEmail);
        painelEmail.setLayout(painelEmailLayout);
        painelEmailLayout.setHorizontalGroup(
            painelEmailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelEmailLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelEmailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(emailField, javax.swing.GroupLayout.DEFAULT_SIZE, 255, Short.MAX_VALUE)
                    .addGroup(painelEmailLayout.createSequentialGroup()
                        .addComponent(jLabel36)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        painelEmailLayout.setVerticalGroup(
            painelEmailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelEmailLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel36)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(emailField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout cadastrarPacienteLayout = new javax.swing.GroupLayout(cadastrarPaciente);
        cadastrarPaciente.setLayout(cadastrarPacienteLayout);
        cadastrarPacienteLayout.setHorizontalGroup(
            cadastrarPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cadastrarPacienteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(cadastrarPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(cadastrarPacienteLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(filler2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(cadastrarPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(filler1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cadastrarPacienteLayout.createSequentialGroup()
                                .addComponent(filler5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(273, 273, 273))
                            .addGroup(cadastrarPacienteLayout.createSequentialGroup()
                                .addGap(116, 116, 116)
                                .addComponent(filler4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(cadastrarPacienteLayout.createSequentialGroup()
                        .addGroup(cadastrarPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(painelConvenio, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(painelRua, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(painelCidade, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(filler6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(painelNome, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 267, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(cadastrarPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(cadastrarPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(painelData, javax.swing.GroupLayout.DEFAULT_SIZE, 267, Short.MAX_VALUE)
                                .addComponent(painelBairro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(painelEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(painelTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(painelSalvar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(543, Short.MAX_VALUE))))
        );
        cadastrarPacienteLayout.setVerticalGroup(
            cadastrarPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cadastrarPacienteLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(cadastrarPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(painelNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(painelTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(cadastrarPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(painelData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(painelCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(cadastrarPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(painelRua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(painelBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(cadastrarPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(painelConvenio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(painelEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(filler4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(filler6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 143, Short.MAX_VALUE)
                .addComponent(filler2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59)
                .addComponent(filler5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(painelSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(filler1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        cardOpcoesSecretaria.add(cadastrarPaciente, "cadastrarPaciente");

        atualizarPaciente.setBackground(new java.awt.Color(51, 51, 51));
        atualizarPaciente.setMaximumSize(new java.awt.Dimension(804, 568));

        painelSelecionarPaciente.setBackground(new java.awt.Color(51, 51, 51));

        jLabel6.setBackground(new java.awt.Color(204, 204, 204));
        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 204, 204));
        jLabel6.setText("Selecione o paciente");

        pacientesBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pacientesBoxActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painelSelecionarPacienteLayout = new javax.swing.GroupLayout(painelSelecionarPaciente);
        painelSelecionarPaciente.setLayout(painelSelecionarPacienteLayout);
        painelSelecionarPacienteLayout.setHorizontalGroup(
            painelSelecionarPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelSelecionarPacienteLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pacientesBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        painelSelecionarPacienteLayout.setVerticalGroup(
            painelSelecionarPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelSelecionarPacienteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelSelecionarPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(pacientesBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        painelAtualizaCidade.setBackground(new java.awt.Color(51, 51, 51));

        atualizaCidadeField.setBackground(new java.awt.Color(255, 255, 255));
        atualizaCidadeField.setForeground(new java.awt.Color(51, 51, 51));

        jLabel4.setBackground(new java.awt.Color(204, 204, 204));
        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 204, 204));
        jLabel4.setText("Cidade");

        javax.swing.GroupLayout painelAtualizaCidadeLayout = new javax.swing.GroupLayout(painelAtualizaCidade);
        painelAtualizaCidade.setLayout(painelAtualizaCidadeLayout);
        painelAtualizaCidadeLayout.setHorizontalGroup(
            painelAtualizaCidadeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelAtualizaCidadeLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelAtualizaCidadeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(atualizaCidadeField)
                    .addGroup(painelAtualizaCidadeLayout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        painelAtualizaCidadeLayout.setVerticalGroup(
            painelAtualizaCidadeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelAtualizaCidadeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(atualizaCidadeField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        painelAtualizaBairro.setBackground(new java.awt.Color(51, 51, 51));
        painelAtualizaBairro.setPreferredSize(new java.awt.Dimension(76, 55));

        atualizaBairroField.setBackground(new java.awt.Color(255, 255, 255));
        atualizaBairroField.setForeground(new java.awt.Color(51, 51, 51));
        atualizaBairroField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atualizaBairroFieldActionPerformed(evt);
            }
        });

        jLabel12.setBackground(new java.awt.Color(204, 204, 204));
        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(204, 204, 204));
        jLabel12.setText("Bairro");

        javax.swing.GroupLayout painelAtualizaBairroLayout = new javax.swing.GroupLayout(painelAtualizaBairro);
        painelAtualizaBairro.setLayout(painelAtualizaBairroLayout);
        painelAtualizaBairroLayout.setHorizontalGroup(
            painelAtualizaBairroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelAtualizaBairroLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelAtualizaBairroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelAtualizaBairroLayout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(atualizaBairroField, javax.swing.GroupLayout.DEFAULT_SIZE, 255, Short.MAX_VALUE))
                .addContainerGap())
        );
        painelAtualizaBairroLayout.setVerticalGroup(
            painelAtualizaBairroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelAtualizaBairroLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(atualizaBairroField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        painelAtualizaNome.setBackground(new java.awt.Color(51, 51, 51));
        painelAtualizaNome.setPreferredSize(new java.awt.Dimension(76, 55));

        atualizaNomeField.setBackground(new java.awt.Color(255, 255, 255));
        atualizaNomeField.setForeground(new java.awt.Color(51, 51, 51));

        jLabel13.setBackground(new java.awt.Color(204, 204, 204));
        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(204, 204, 204));
        jLabel13.setText("Nome");

        javax.swing.GroupLayout painelAtualizaNomeLayout = new javax.swing.GroupLayout(painelAtualizaNome);
        painelAtualizaNome.setLayout(painelAtualizaNomeLayout);
        painelAtualizaNomeLayout.setHorizontalGroup(
            painelAtualizaNomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelAtualizaNomeLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelAtualizaNomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(atualizaNomeField, javax.swing.GroupLayout.DEFAULT_SIZE, 255, Short.MAX_VALUE)
                    .addGroup(painelAtualizaNomeLayout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        painelAtualizaNomeLayout.setVerticalGroup(
            painelAtualizaNomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelAtualizaNomeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(atualizaNomeField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        painelAtualizaRua.setBackground(new java.awt.Color(51, 51, 51));

        atualizaRuaField.setBackground(new java.awt.Color(255, 255, 255));
        atualizaRuaField.setForeground(new java.awt.Color(51, 51, 51));

        jLabel14.setBackground(new java.awt.Color(204, 204, 204));
        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(204, 204, 204));
        jLabel14.setText("Rua");

        javax.swing.GroupLayout painelAtualizaRuaLayout = new javax.swing.GroupLayout(painelAtualizaRua);
        painelAtualizaRua.setLayout(painelAtualizaRuaLayout);
        painelAtualizaRuaLayout.setHorizontalGroup(
            painelAtualizaRuaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelAtualizaRuaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelAtualizaRuaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(atualizaRuaField)
                    .addGroup(painelAtualizaRuaLayout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        painelAtualizaRuaLayout.setVerticalGroup(
            painelAtualizaRuaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelAtualizaRuaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(atualizaRuaField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        painelAtualizaTelefone.setBackground(new java.awt.Color(51, 51, 51));
        painelAtualizaTelefone.setPreferredSize(new java.awt.Dimension(76, 55));

        atualizaTelField.setBackground(new java.awt.Color(255, 255, 255));
        atualizaTelField.setForeground(new java.awt.Color(51, 51, 51));

        jLabel15.setBackground(new java.awt.Color(204, 204, 204));
        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(204, 204, 204));
        jLabel15.setText("Telefone");

        javax.swing.GroupLayout painelAtualizaTelefoneLayout = new javax.swing.GroupLayout(painelAtualizaTelefone);
        painelAtualizaTelefone.setLayout(painelAtualizaTelefoneLayout);
        painelAtualizaTelefoneLayout.setHorizontalGroup(
            painelAtualizaTelefoneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelAtualizaTelefoneLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelAtualizaTelefoneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(atualizaTelField, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        painelAtualizaTelefoneLayout.setVerticalGroup(
            painelAtualizaTelefoneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelAtualizaTelefoneLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(atualizaTelField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        painelAtualizaData.setBackground(new java.awt.Color(51, 51, 51));
        painelAtualizaData.setPreferredSize(new java.awt.Dimension(76, 55));

        jLabel16.setBackground(new java.awt.Color(204, 204, 204));
        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(204, 204, 204));
        jLabel16.setText("Data de Nascimento");

        atualizaDataNascCalendar.setBackground(new java.awt.Color(255, 255, 255));
        atualizaDataNascCalendar.setDateFormatString("dd-MM-yyyy");
        atualizaDataNascCalendar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        javax.swing.GroupLayout painelAtualizaDataLayout = new javax.swing.GroupLayout(painelAtualizaData);
        painelAtualizaData.setLayout(painelAtualizaDataLayout);
        painelAtualizaDataLayout.setHorizontalGroup(
            painelAtualizaDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelAtualizaDataLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelAtualizaDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelAtualizaDataLayout.createSequentialGroup()
                        .addComponent(atualizaDataNascCalendar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(painelAtualizaDataLayout.createSequentialGroup()
                        .addComponent(jLabel16)
                        .addGap(0, 151, Short.MAX_VALUE))))
        );
        painelAtualizaDataLayout.setVerticalGroup(
            painelAtualizaDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelAtualizaDataLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(atualizaDataNascCalendar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        painelAtualizaConvenio.setBackground(new java.awt.Color(51, 51, 51));

        jLabel17.setBackground(new java.awt.Color(204, 204, 204));
        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(204, 204, 204));
        jLabel17.setText("Tipo de Conv??nio");

        atualizaRadioParticular.setBackground(new java.awt.Color(51, 51, 51));
        atualizaRadioParticular.setForeground(new java.awt.Color(204, 204, 204));
        atualizaRadioParticular.setText("Particular");
        atualizaRadioParticular.setActionCommand("particular");
        atualizaRadioParticular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atualizaRadioParticularActionPerformed(evt);
            }
        });

        atualizaRadioPlanodeSaude.setBackground(new java.awt.Color(51, 51, 51));
        atualizaRadioPlanodeSaude.setForeground(new java.awt.Color(204, 204, 204));
        atualizaRadioPlanodeSaude.setText("Plano de Sa??de");
        atualizaRadioPlanodeSaude.setActionCommand("plano de sa??de");

        javax.swing.GroupLayout painelAtualizaConvenioLayout = new javax.swing.GroupLayout(painelAtualizaConvenio);
        painelAtualizaConvenio.setLayout(painelAtualizaConvenioLayout);
        painelAtualizaConvenioLayout.setHorizontalGroup(
            painelAtualizaConvenioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelAtualizaConvenioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelAtualizaConvenioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelAtualizaConvenioLayout.createSequentialGroup()
                        .addComponent(jLabel17)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(painelAtualizaConvenioLayout.createSequentialGroup()
                        .addComponent(atualizaRadioParticular)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 78, Short.MAX_VALUE)
                        .addComponent(atualizaRadioPlanodeSaude)))
                .addContainerGap())
        );
        painelAtualizaConvenioLayout.setVerticalGroup(
            painelAtualizaConvenioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelAtualizaConvenioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelAtualizaConvenioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(atualizaRadioParticular)
                    .addComponent(atualizaRadioPlanodeSaude))
                .addContainerGap(8, Short.MAX_VALUE))
        );

        painelAtualizar.setBackground(new java.awt.Color(51, 51, 51));

        botaoAtualizarDados.setBackground(new java.awt.Color(204, 204, 204));
        botaoAtualizarDados.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        botaoAtualizarDados.setForeground(new java.awt.Color(51, 51, 51));
        botaoAtualizarDados.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/botoes/default.png"))); // NOI18N
        botaoAtualizarDados.setText("Atualizar");
        botaoAtualizarDados.setBorder(null);
        botaoAtualizarDados.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botaoAtualizarDados.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/botoes/pressed.png"))); // NOI18N
        botaoAtualizarDados.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/botoes/hover.png"))); // NOI18N
        botaoAtualizarDados.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/botoes/selected.png"))); // NOI18N
        botaoAtualizarDados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoAtualizarDadosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painelAtualizarLayout = new javax.swing.GroupLayout(painelAtualizar);
        painelAtualizar.setLayout(painelAtualizarLayout);
        painelAtualizarLayout.setHorizontalGroup(
            painelAtualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelAtualizarLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(botaoAtualizarDados, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        painelAtualizarLayout.setVerticalGroup(
            painelAtualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelAtualizarLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(botaoAtualizarDados, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        painelAtualizaEmail.setBackground(new java.awt.Color(51, 51, 51));
        painelAtualizaEmail.setPreferredSize(new java.awt.Dimension(76, 55));

        atualizaEmailField.setBackground(new java.awt.Color(255, 255, 255));
        atualizaEmailField.setForeground(new java.awt.Color(51, 51, 51));
        atualizaEmailField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atualizaEmailFieldActionPerformed(evt);
            }
        });

        jLabel35.setBackground(new java.awt.Color(204, 204, 204));
        jLabel35.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(204, 204, 204));
        jLabel35.setText("Email");

        javax.swing.GroupLayout painelAtualizaEmailLayout = new javax.swing.GroupLayout(painelAtualizaEmail);
        painelAtualizaEmail.setLayout(painelAtualizaEmailLayout);
        painelAtualizaEmailLayout.setHorizontalGroup(
            painelAtualizaEmailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelAtualizaEmailLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelAtualizaEmailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelAtualizaEmailLayout.createSequentialGroup()
                        .addComponent(jLabel35)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(atualizaEmailField, javax.swing.GroupLayout.DEFAULT_SIZE, 255, Short.MAX_VALUE))
                .addContainerGap())
        );
        painelAtualizaEmailLayout.setVerticalGroup(
            painelAtualizaEmailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelAtualizaEmailLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel35)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(atualizaEmailField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout atualizarPacienteLayout = new javax.swing.GroupLayout(atualizarPaciente);
        atualizarPaciente.setLayout(atualizarPacienteLayout);
        atualizarPacienteLayout.setHorizontalGroup(
            atualizarPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(atualizarPacienteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(atualizarPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(atualizarPacienteLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(painelAtualizar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(atualizarPacienteLayout.createSequentialGroup()
                        .addGroup(atualizarPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(painelSelecionarPaciente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(painelAtualizaConvenio, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(painelAtualizaRua, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(painelAtualizaCidade, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(painelAtualizaNome, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 267, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(atualizarPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(painelAtualizaData, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(painelAtualizaBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(painelAtualizaEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(painelAtualizaTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(543, Short.MAX_VALUE))
        );
        atualizarPacienteLayout.setVerticalGroup(
            atualizarPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(atualizarPacienteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(atualizarPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, atualizarPacienteLayout.createSequentialGroup()
                        .addComponent(painelSelecionarPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 113, Short.MAX_VALUE)
                        .addComponent(painelAtualizaNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, atualizarPacienteLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(painelAtualizaTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(atualizarPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(painelAtualizaData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(painelAtualizaCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(atualizarPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(painelAtualizaRua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(painelAtualizaBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(atualizarPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(painelAtualizaConvenio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(painelAtualizaEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(88, 88, 88)
                .addComponent(painelAtualizar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        cardOpcoesSecretaria.add(atualizarPaciente, "atualizarPaciente");

        removerPaciente.setBackground(new java.awt.Color(51, 51, 51));

        painelExcluirPaciente.setBackground(new java.awt.Color(51, 51, 51));

        jLabel18.setBackground(new java.awt.Color(204, 204, 204));
        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(204, 204, 204));
        jLabel18.setText("Selecione o paciente que deseja excluir:");

        jScrollPane1.setViewportView(listaPacientes);

        painelRemover.setBackground(new java.awt.Color(51, 51, 51));

        botaoRemoverPac.setBackground(new java.awt.Color(204, 204, 204));
        botaoRemoverPac.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        botaoRemoverPac.setForeground(new java.awt.Color(51, 51, 51));
        botaoRemoverPac.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/botoes/default.png"))); // NOI18N
        botaoRemoverPac.setText("Remover");
        botaoRemoverPac.setBorder(null);
        botaoRemoverPac.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botaoRemoverPac.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/botoes/pressed.png"))); // NOI18N
        botaoRemoverPac.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/botoes/hover.png"))); // NOI18N
        botaoRemoverPac.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/botoes/selected.png"))); // NOI18N
        botaoRemoverPac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoRemoverPacActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painelRemoverLayout = new javax.swing.GroupLayout(painelRemover);
        painelRemover.setLayout(painelRemoverLayout);
        painelRemoverLayout.setHorizontalGroup(
            painelRemoverLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelRemoverLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(botaoRemoverPac, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        painelRemoverLayout.setVerticalGroup(
            painelRemoverLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelRemoverLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(botaoRemoverPac, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout painelExcluirPacienteLayout = new javax.swing.GroupLayout(painelExcluirPaciente);
        painelExcluirPaciente.setLayout(painelExcluirPacienteLayout);
        painelExcluirPacienteLayout.setHorizontalGroup(
            painelExcluirPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelExcluirPacienteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelExcluirPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(painelRemover, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(painelExcluirPacienteLayout.createSequentialGroup()
                        .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(301, 301, 301))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING))
                .addContainerGap())
        );
        painelExcluirPacienteLayout.setVerticalGroup(
            painelExcluirPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelExcluirPacienteLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel18)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 411, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                .addComponent(painelRemover, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout removerPacienteLayout = new javax.swing.GroupLayout(removerPaciente);
        removerPaciente.setLayout(removerPacienteLayout);
        removerPacienteLayout.setHorizontalGroup(
            removerPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(removerPacienteLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(painelExcluirPaciente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        removerPacienteLayout.setVerticalGroup(
            removerPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(removerPacienteLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(painelExcluirPaciente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        cardOpcoesSecretaria.add(removerPaciente, "removerPaciente");

        cadastrarConsulta.setBackground(new java.awt.Color(51, 51, 51));

        painelHorario.setBackground(new java.awt.Color(51, 51, 51));
        painelHorario.setPreferredSize(new java.awt.Dimension(76, 55));

        horarioField.setBackground(new java.awt.Color(255, 255, 255));
        horarioField.setForeground(new java.awt.Color(51, 51, 51));

        jLabel20.setBackground(new java.awt.Color(204, 204, 204));
        jLabel20.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(204, 204, 204));
        jLabel20.setText("Horario");

        javax.swing.GroupLayout painelHorarioLayout = new javax.swing.GroupLayout(painelHorario);
        painelHorario.setLayout(painelHorarioLayout);
        painelHorarioLayout.setHorizontalGroup(
            painelHorarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelHorarioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelHorarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(horarioField, javax.swing.GroupLayout.DEFAULT_SIZE, 255, Short.MAX_VALUE)
                    .addGroup(painelHorarioLayout.createSequentialGroup()
                        .addComponent(jLabel20)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        painelHorarioLayout.setVerticalGroup(
            painelHorarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelHorarioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel20)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(horarioField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        painelPacCons.setBackground(new java.awt.Color(51, 51, 51));

        jLabel21.setBackground(new java.awt.Color(204, 204, 204));
        jLabel21.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(204, 204, 204));
        jLabel21.setText("Selecione o paciente");

        pacientesBoxCons.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pacientesBoxConsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painelPacConsLayout = new javax.swing.GroupLayout(painelPacCons);
        painelPacCons.setLayout(painelPacConsLayout);
        painelPacConsLayout.setHorizontalGroup(
            painelPacConsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelPacConsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelPacConsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pacientesBoxCons, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(painelPacConsLayout.createSequentialGroup()
                        .addComponent(jLabel21)
                        .addGap(0, 141, Short.MAX_VALUE)))
                .addContainerGap())
        );
        painelPacConsLayout.setVerticalGroup(
            painelPacConsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelPacConsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel21)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pacientesBoxCons, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        painelMedico.setBackground(new java.awt.Color(51, 51, 51));

        medicoField.setBackground(new java.awt.Color(255, 255, 255));
        medicoField.setForeground(new java.awt.Color(51, 51, 51));

        jLabel24.setBackground(new java.awt.Color(204, 204, 204));
        jLabel24.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(204, 204, 204));
        jLabel24.setText("Medico");

        javax.swing.GroupLayout painelMedicoLayout = new javax.swing.GroupLayout(painelMedico);
        painelMedico.setLayout(painelMedicoLayout);
        painelMedicoLayout.setHorizontalGroup(
            painelMedicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelMedicoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelMedicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(medicoField, javax.swing.GroupLayout.DEFAULT_SIZE, 255, Short.MAX_VALUE)
                    .addGroup(painelMedicoLayout.createSequentialGroup()
                        .addComponent(jLabel24)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        painelMedicoLayout.setVerticalGroup(
            painelMedicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelMedicoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel24)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(medicoField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        painelDataCons.setBackground(new java.awt.Color(51, 51, 51));
        painelDataCons.setPreferredSize(new java.awt.Dimension(76, 55));

        jLabel25.setBackground(new java.awt.Color(204, 204, 204));
        jLabel25.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(204, 204, 204));
        jLabel25.setText("Data da Consulta");

        dataConsCalendar.setBackground(new java.awt.Color(255, 255, 255));
        dataConsCalendar.setDateFormatString("dd-MM-yyyy");
        dataConsCalendar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        javax.swing.GroupLayout painelDataConsLayout = new javax.swing.GroupLayout(painelDataCons);
        painelDataCons.setLayout(painelDataConsLayout);
        painelDataConsLayout.setHorizontalGroup(
            painelDataConsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelDataConsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelDataConsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelDataConsLayout.createSequentialGroup()
                        .addComponent(jLabel25)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(dataConsCalendar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        painelDataConsLayout.setVerticalGroup(
            painelDataConsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelDataConsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel25)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(dataConsCalendar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        painelTipoCons.setBackground(new java.awt.Color(51, 51, 51));
        painelTipoCons.setPreferredSize(new java.awt.Dimension(76, 55));

        jLabel26.setBackground(new java.awt.Color(204, 204, 204));
        jLabel26.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(204, 204, 204));
        jLabel26.setText("Tipo de Consulta");

        radioNormal.setBackground(new java.awt.Color(51, 51, 51));
        radioNormal.setForeground(new java.awt.Color(204, 204, 204));
        radioNormal.setText("Normal");
        radioNormal.setActionCommand("normal");
        radioNormal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioNormalActionPerformed(evt);
            }
        });

        radioRetorno.setBackground(new java.awt.Color(51, 51, 51));
        radioRetorno.setForeground(new java.awt.Color(204, 204, 204));
        radioRetorno.setText("Retorno");
        radioRetorno.setActionCommand("retorno");
        radioRetorno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioRetornoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painelTipoConsLayout = new javax.swing.GroupLayout(painelTipoCons);
        painelTipoCons.setLayout(painelTipoConsLayout);
        painelTipoConsLayout.setHorizontalGroup(
            painelTipoConsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelTipoConsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelTipoConsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelTipoConsLayout.createSequentialGroup()
                        .addComponent(jLabel26)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(painelTipoConsLayout.createSequentialGroup()
                        .addComponent(radioNormal)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 127, Short.MAX_VALUE)
                        .addComponent(radioRetorno)))
                .addContainerGap())
        );
        painelTipoConsLayout.setVerticalGroup(
            painelTipoConsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelTipoConsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel26)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelTipoConsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radioNormal)
                    .addComponent(radioRetorno))
                .addContainerGap(8, Short.MAX_VALUE))
        );

        painelSalvarCons.setBackground(new java.awt.Color(51, 51, 51));

        botaoSalvarCons.setBackground(new java.awt.Color(204, 204, 204));
        botaoSalvarCons.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        botaoSalvarCons.setForeground(new java.awt.Color(51, 51, 51));
        botaoSalvarCons.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/botoes/default.png"))); // NOI18N
        botaoSalvarCons.setText("Salvar");
        botaoSalvarCons.setBorder(null);
        botaoSalvarCons.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botaoSalvarCons.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/botoes/pressed.png"))); // NOI18N
        botaoSalvarCons.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/botoes/hover.png"))); // NOI18N
        botaoSalvarCons.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/botoes/selected.png"))); // NOI18N
        botaoSalvarCons.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoSalvarConsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painelSalvarConsLayout = new javax.swing.GroupLayout(painelSalvarCons);
        painelSalvarCons.setLayout(painelSalvarConsLayout);
        painelSalvarConsLayout.setHorizontalGroup(
            painelSalvarConsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelSalvarConsLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(botaoSalvarCons, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        painelSalvarConsLayout.setVerticalGroup(
            painelSalvarConsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelSalvarConsLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(botaoSalvarCons, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout cadastrarConsultaLayout = new javax.swing.GroupLayout(cadastrarConsulta);
        cadastrarConsulta.setLayout(cadastrarConsultaLayout);
        cadastrarConsultaLayout.setHorizontalGroup(
            cadastrarConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cadastrarConsultaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(cadastrarConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(painelTipoCons, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(cadastrarConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cadastrarConsultaLayout.createSequentialGroup()
                            .addGap(250, 250, 250)
                            .addComponent(painelSalvarCons, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(cadastrarConsultaLayout.createSequentialGroup()
                            .addGroup(cadastrarConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(painelPacCons, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(painelHorario, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(cadastrarConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(painelDataCons, javax.swing.GroupLayout.DEFAULT_SIZE, 267, Short.MAX_VALUE)
                                .addComponent(painelMedico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        cadastrarConsultaLayout.setVerticalGroup(
            cadastrarConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cadastrarConsultaLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(cadastrarConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(painelPacCons, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(painelMedico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(cadastrarConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(painelDataCons, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(painelHorario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(painelTipoCons, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 308, Short.MAX_VALUE)
                .addComponent(painelSalvarCons, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        cardOpcoesSecretaria.add(cadastrarConsulta, "cadastrarConsulta");

        atualizarConsulta.setBackground(new java.awt.Color(51, 51, 51));

        painelAtualizarHorario.setBackground(new java.awt.Color(51, 51, 51));
        painelAtualizarHorario.setPreferredSize(new java.awt.Dimension(76, 55));

        atualizarHorarioField.setBackground(new java.awt.Color(255, 255, 255));
        atualizarHorarioField.setForeground(new java.awt.Color(51, 51, 51));

        jLabel22.setBackground(new java.awt.Color(204, 204, 204));
        jLabel22.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(204, 204, 204));
        jLabel22.setText("Horario");

        javax.swing.GroupLayout painelAtualizarHorarioLayout = new javax.swing.GroupLayout(painelAtualizarHorario);
        painelAtualizarHorario.setLayout(painelAtualizarHorarioLayout);
        painelAtualizarHorarioLayout.setHorizontalGroup(
            painelAtualizarHorarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelAtualizarHorarioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelAtualizarHorarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(atualizarHorarioField)
                    .addGroup(painelAtualizarHorarioLayout.createSequentialGroup()
                        .addComponent(jLabel22)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        painelAtualizarHorarioLayout.setVerticalGroup(
            painelAtualizarHorarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelAtualizarHorarioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel22)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(atualizarHorarioField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        painelSelecicionarCons.setBackground(new java.awt.Color(51, 51, 51));
        painelSelecicionarCons.setPreferredSize(new java.awt.Dimension(76, 55));

        jLabel23.setBackground(new java.awt.Color(204, 204, 204));
        jLabel23.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(204, 204, 204));
        jLabel23.setText("Selecione a consulta");

        consBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consBoxActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painelSelecicionarConsLayout = new javax.swing.GroupLayout(painelSelecicionarCons);
        painelSelecicionarCons.setLayout(painelSelecicionarConsLayout);
        painelSelecicionarConsLayout.setHorizontalGroup(
            painelSelecicionarConsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelSelecicionarConsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelSelecicionarConsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(consBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(painelSelecicionarConsLayout.createSequentialGroup()
                        .addComponent(jLabel23)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        painelSelecicionarConsLayout.setVerticalGroup(
            painelSelecicionarConsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelSelecicionarConsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel23)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(consBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        painelAtualizarMedico.setBackground(new java.awt.Color(51, 51, 51));

        atualizarMedicoField.setBackground(new java.awt.Color(255, 255, 255));
        atualizarMedicoField.setForeground(new java.awt.Color(51, 51, 51));

        jLabel27.setBackground(new java.awt.Color(204, 204, 204));
        jLabel27.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(204, 204, 204));
        jLabel27.setText("Medico");

        javax.swing.GroupLayout painelAtualizarMedicoLayout = new javax.swing.GroupLayout(painelAtualizarMedico);
        painelAtualizarMedico.setLayout(painelAtualizarMedicoLayout);
        painelAtualizarMedicoLayout.setHorizontalGroup(
            painelAtualizarMedicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelAtualizarMedicoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelAtualizarMedicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(atualizarMedicoField)
                    .addGroup(painelAtualizarMedicoLayout.createSequentialGroup()
                        .addComponent(jLabel27)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        painelAtualizarMedicoLayout.setVerticalGroup(
            painelAtualizarMedicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelAtualizarMedicoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel27)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(atualizarMedicoField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        painelAtualizarDataCons.setBackground(new java.awt.Color(51, 51, 51));
        painelAtualizarDataCons.setPreferredSize(new java.awt.Dimension(76, 55));

        jLabel28.setBackground(new java.awt.Color(204, 204, 204));
        jLabel28.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(204, 204, 204));
        jLabel28.setText("Data da Consulta");

        atualizarDataConsCalendar.setBackground(new java.awt.Color(255, 255, 255));
        atualizarDataConsCalendar.setDateFormatString("dd-MM-yyyy");
        atualizarDataConsCalendar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        javax.swing.GroupLayout painelAtualizarDataConsLayout = new javax.swing.GroupLayout(painelAtualizarDataCons);
        painelAtualizarDataCons.setLayout(painelAtualizarDataConsLayout);
        painelAtualizarDataConsLayout.setHorizontalGroup(
            painelAtualizarDataConsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelAtualizarDataConsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelAtualizarDataConsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelAtualizarDataConsLayout.createSequentialGroup()
                        .addComponent(jLabel28)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(atualizarDataConsCalendar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        painelAtualizarDataConsLayout.setVerticalGroup(
            painelAtualizarDataConsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelAtualizarDataConsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel28)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(atualizarDataConsCalendar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        painelAtualizarTipoCons.setBackground(new java.awt.Color(51, 51, 51));
        painelAtualizarTipoCons.setPreferredSize(new java.awt.Dimension(76, 55));

        jLabel29.setBackground(new java.awt.Color(204, 204, 204));
        jLabel29.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(204, 204, 204));
        jLabel29.setText("Tipo de Consulta");

        atualizarRadioNormal.setBackground(new java.awt.Color(51, 51, 51));
        atualizarRadioNormal.setForeground(new java.awt.Color(204, 204, 204));
        atualizarRadioNormal.setText("Normal");
        atualizarRadioNormal.setActionCommand("normal");
        atualizarRadioNormal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atualizarRadioNormalActionPerformed(evt);
            }
        });

        atualizarRadioRetorno.setBackground(new java.awt.Color(51, 51, 51));
        atualizarRadioRetorno.setForeground(new java.awt.Color(204, 204, 204));
        atualizarRadioRetorno.setText("Retorno");
        atualizarRadioRetorno.setActionCommand("retorno");
        atualizarRadioRetorno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atualizarRadioRetornoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painelAtualizarTipoConsLayout = new javax.swing.GroupLayout(painelAtualizarTipoCons);
        painelAtualizarTipoCons.setLayout(painelAtualizarTipoConsLayout);
        painelAtualizarTipoConsLayout.setHorizontalGroup(
            painelAtualizarTipoConsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelAtualizarTipoConsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelAtualizarTipoConsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelAtualizarTipoConsLayout.createSequentialGroup()
                        .addComponent(jLabel29)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(painelAtualizarTipoConsLayout.createSequentialGroup()
                        .addComponent(atualizarRadioNormal)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 127, Short.MAX_VALUE)
                        .addComponent(atualizarRadioRetorno)))
                .addContainerGap())
        );
        painelAtualizarTipoConsLayout.setVerticalGroup(
            painelAtualizarTipoConsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelAtualizarTipoConsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel29)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelAtualizarTipoConsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(atualizarRadioNormal)
                    .addComponent(atualizarRadioRetorno))
                .addContainerGap(8, Short.MAX_VALUE))
        );

        painelBotaoAtualizarCons.setBackground(new java.awt.Color(51, 51, 51));

        botaoAtualizarCons.setBackground(new java.awt.Color(204, 204, 204));
        botaoAtualizarCons.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        botaoAtualizarCons.setForeground(new java.awt.Color(51, 51, 51));
        botaoAtualizarCons.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/botoes/default.png"))); // NOI18N
        botaoAtualizarCons.setText("Atualizar");
        botaoAtualizarCons.setBorder(null);
        botaoAtualizarCons.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botaoAtualizarCons.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/botoes/pressed.png"))); // NOI18N
        botaoAtualizarCons.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/botoes/hover.png"))); // NOI18N
        botaoAtualizarCons.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/botoes/selected.png"))); // NOI18N
        botaoAtualizarCons.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoAtualizarConsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painelBotaoAtualizarConsLayout = new javax.swing.GroupLayout(painelBotaoAtualizarCons);
        painelBotaoAtualizarCons.setLayout(painelBotaoAtualizarConsLayout);
        painelBotaoAtualizarConsLayout.setHorizontalGroup(
            painelBotaoAtualizarConsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelBotaoAtualizarConsLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(botaoAtualizarCons, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        painelBotaoAtualizarConsLayout.setVerticalGroup(
            painelBotaoAtualizarConsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelBotaoAtualizarConsLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(botaoAtualizarCons, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        painelNomePaciente.setBackground(new java.awt.Color(51, 51, 51));
        painelNomePaciente.setPreferredSize(new java.awt.Dimension(76, 55));

        jLabel30.setBackground(new java.awt.Color(204, 204, 204));
        jLabel30.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(204, 204, 204));
        jLabel30.setText("Nome do Paciente");

        nomePacienteConsField.setEditable(false);
        nomePacienteConsField.setBackground(new java.awt.Color(255, 255, 255));
        nomePacienteConsField.setForeground(new java.awt.Color(51, 51, 51));

        javax.swing.GroupLayout painelNomePacienteLayout = new javax.swing.GroupLayout(painelNomePaciente);
        painelNomePaciente.setLayout(painelNomePacienteLayout);
        painelNomePacienteLayout.setHorizontalGroup(
            painelNomePacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelNomePacienteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelNomePacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nomePacienteConsField, javax.swing.GroupLayout.DEFAULT_SIZE, 255, Short.MAX_VALUE)
                    .addGroup(painelNomePacienteLayout.createSequentialGroup()
                        .addComponent(jLabel30)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        painelNomePacienteLayout.setVerticalGroup(
            painelNomePacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelNomePacienteLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel30)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nomePacienteConsField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout atualizarConsultaLayout = new javax.swing.GroupLayout(atualizarConsulta);
        atualizarConsulta.setLayout(atualizarConsultaLayout);
        atualizarConsultaLayout.setHorizontalGroup(
            atualizarConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(atualizarConsultaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(atualizarConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(painelBotaoAtualizarCons, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(atualizarConsultaLayout.createSequentialGroup()
                        .addGroup(atualizarConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(painelSelecicionarCons, javax.swing.GroupLayout.DEFAULT_SIZE, 267, Short.MAX_VALUE)
                            .addComponent(painelAtualizarTipoCons, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 267, Short.MAX_VALUE)
                            .addComponent(painelAtualizarHorario, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 267, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(atualizarConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(painelAtualizarDataCons, javax.swing.GroupLayout.DEFAULT_SIZE, 267, Short.MAX_VALUE)
                            .addComponent(painelAtualizarMedico, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(painelNomePaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(543, Short.MAX_VALUE))
        );
        atualizarConsultaLayout.setVerticalGroup(
            atualizarConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(atualizarConsultaLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(atualizarConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(painelSelecicionarCons, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(painelAtualizarMedico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(atualizarConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(painelAtualizarDataCons, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(painelAtualizarHorario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(atualizarConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(painelNomePaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(painelAtualizarTipoCons, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 308, Short.MAX_VALUE)
                .addComponent(painelBotaoAtualizarCons, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        cardOpcoesSecretaria.add(atualizarConsulta, "atualizarConsulta");

        removerConsulta.setBackground(new java.awt.Color(51, 51, 51));

        painelExcluirConsulta.setBackground(new java.awt.Color(51, 51, 51));

        jLabel31.setBackground(new java.awt.Color(204, 204, 204));
        jLabel31.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(204, 204, 204));
        jLabel31.setText("Selecione o paciente em que a consulta est?? cadastrada:");

        jScrollPane2.setViewportView(listaCons);

        painelRemoverCons.setBackground(new java.awt.Color(51, 51, 51));

        botaoRemoverCons.setBackground(new java.awt.Color(204, 204, 204));
        botaoRemoverCons.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        botaoRemoverCons.setForeground(new java.awt.Color(51, 51, 51));
        botaoRemoverCons.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/botoes/default.png"))); // NOI18N
        botaoRemoverCons.setText("Remover");
        botaoRemoverCons.setBorder(null);
        botaoRemoverCons.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botaoRemoverCons.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/botoes/pressed.png"))); // NOI18N
        botaoRemoverCons.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/botoes/hover.png"))); // NOI18N
        botaoRemoverCons.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/botoes/selected.png"))); // NOI18N
        botaoRemoverCons.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoRemoverConsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painelRemoverConsLayout = new javax.swing.GroupLayout(painelRemoverCons);
        painelRemoverCons.setLayout(painelRemoverConsLayout);
        painelRemoverConsLayout.setHorizontalGroup(
            painelRemoverConsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelRemoverConsLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(botaoRemoverCons, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        painelRemoverConsLayout.setVerticalGroup(
            painelRemoverConsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelRemoverConsLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(botaoRemoverCons, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout painelExcluirConsultaLayout = new javax.swing.GroupLayout(painelExcluirConsulta);
        painelExcluirConsulta.setLayout(painelExcluirConsultaLayout);
        painelExcluirConsultaLayout.setHorizontalGroup(
            painelExcluirConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelExcluirConsultaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelExcluirConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(painelRemoverCons, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(painelExcluirConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 532, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 60, Short.MAX_VALUE))
        );
        painelExcluirConsultaLayout.setVerticalGroup(
            painelExcluirConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelExcluirConsultaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel31)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 411, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                .addComponent(painelRemoverCons, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout removerConsultaLayout = new javax.swing.GroupLayout(removerConsulta);
        removerConsulta.setLayout(removerConsultaLayout);
        removerConsultaLayout.setHorizontalGroup(
            removerConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(removerConsultaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(painelExcluirConsulta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        removerConsultaLayout.setVerticalGroup(
            removerConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(removerConsultaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(painelExcluirConsulta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        cardOpcoesSecretaria.add(removerConsulta, "removerConsulta");

        emitirRelatorioCons.setBackground(new java.awt.Color(51, 51, 51));

        painelEmitirRelCons.setBackground(new java.awt.Color(51, 51, 51));

        jLabel33.setBackground(new java.awt.Color(204, 204, 204));
        jLabel33.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(204, 204, 204));
        jLabel33.setText("Os seguintes pacientes possuem consulta para o dia");

        jScrollPane3.setViewportView(listaRelCons);

        JPanelDataChecks.setBackground(new java.awt.Color(51, 51, 51));

        consProximoDiaField.setEditable(false);
        consProximoDiaField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consProximoDiaFieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout JPanelDataChecksLayout = new javax.swing.GroupLayout(JPanelDataChecks);
        JPanelDataChecks.setLayout(JPanelDataChecksLayout);
        JPanelDataChecksLayout.setHorizontalGroup(
            JPanelDataChecksLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanelDataChecksLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(consProximoDiaField, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        JPanelDataChecksLayout.setVerticalGroup(
            JPanelDataChecksLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanelDataChecksLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(consProximoDiaField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 2, Short.MAX_VALUE))
        );

        celularCheck.setText("Filtrar por Celular");
        celularCheck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                celularCheckActionPerformed(evt);
            }
        });

        emailCheck.setText("Filtrar por Email");
        emailCheck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailCheckActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painelEmitirRelConsLayout = new javax.swing.GroupLayout(painelEmitirRelCons);
        painelEmitirRelCons.setLayout(painelEmitirRelConsLayout);
        painelEmitirRelConsLayout.setHorizontalGroup(
            painelEmitirRelConsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelEmitirRelConsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelEmitirRelConsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelEmitirRelConsLayout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 532, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 63, Short.MAX_VALUE))
                    .addGroup(painelEmitirRelConsLayout.createSequentialGroup()
                        .addComponent(jLabel33)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(painelEmitirRelConsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(painelEmitirRelConsLayout.createSequentialGroup()
                                .addComponent(filler18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(JPanelDataChecks, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelEmitirRelConsLayout.createSequentialGroup()
                        .addComponent(emailCheck, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(celularCheck, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(113, 113, 113))))
        );
        painelEmitirRelConsLayout.setVerticalGroup(
            painelEmitirRelConsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelEmitirRelConsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelEmitirRelConsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel33, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(JPanelDataChecks, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(3, 3, 3)
                .addGroup(painelEmitirRelConsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(celularCheck)
                    .addComponent(emailCheck))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(filler18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 432, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45))
        );

        javax.swing.GroupLayout emitirRelatorioConsLayout = new javax.swing.GroupLayout(emitirRelatorioCons);
        emitirRelatorioCons.setLayout(emitirRelatorioConsLayout);
        emitirRelatorioConsLayout.setHorizontalGroup(
            emitirRelatorioConsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(emitirRelatorioConsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(painelEmitirRelCons, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        emitirRelatorioConsLayout.setVerticalGroup(
            emitirRelatorioConsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(emitirRelatorioConsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(painelEmitirRelCons, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        cardOpcoesSecretaria.add(emitirRelatorioCons, "emitirRelatorioCons");

        jSplitPane2.setRightComponent(cardOpcoesSecretaria);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jSplitPane2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 568, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaoVoltarMainvoltarMenuPrincipal(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoVoltarMainvoltarMenuPrincipal
        // TODO add your handling code here:
        this.setVisible(false);
        new trabalho2.Trabalho2().show();
    }//GEN-LAST:event_botaoVoltarMainvoltarMenuPrincipal

    private void botaoRelatorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoRelatorioActionPerformed
        menu.show(cardMenu, "menuRelatorioConsultas");
        //atualizarCamposConsAlteracao();
    }//GEN-LAST:event_botaoRelatorioActionPerformed

    private void botaoPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoPacienteActionPerformed
        // TODO add your handling code here:
        menu.show(cardMenu, "menuGerenciarPaciente");
    }//GEN-LAST:event_botaoPacienteActionPerformed

    private void botaoVoltarSecvoltarMenuPrincipal(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoVoltarSecvoltarMenuPrincipal
        // TODO add your handling code here:
        limparCampos(getContentPane());
        menu.show(cardMenu, "menuSecretaria");
        opcoesSec.show(cardOpcoesSecretaria, "telaDefault");
                
    }//GEN-LAST:event_botaoVoltarSecvoltarMenuPrincipal

    public void atualizarComboBoxPacientes(){
        limparCampos(getContentPane());
        pacientes = sec.consultarPacientes();
        if (pacientes.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Nenhum paciente cadastrado", "Atualizar Paciente", JOptionPane.WARNING_MESSAGE);
        }else{
            pacientesBox.removeAllItems();
            opcoesSec.show(cardOpcoesSecretaria, "atualizarPaciente");
            
            pacientes.forEach(itens -> {
                pacientesBox.addItem(itens.getNome());
            });     
            atualizarCamposAlteracao();
        }
    }
    
    private void botaoAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoAtualizarActionPerformed
        atualizarComboBoxPacientes();
    }//GEN-LAST:event_botaoAtualizarActionPerformed

    private void botaoCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCadastrarActionPerformed
        limparCampos(getContentPane());
        opcoesSec.show(cardOpcoesSecretaria, "cadastrarPaciente");
        //cadastrarPaciente.setSize(804, 568);
    }//GEN-LAST:event_botaoCadastrarActionPerformed
    
    public void atualizarListaRemover(){
        pacientes = sec.consultarPacientes();
        if (pacientes.isEmpty()) {
            opcoesSec.show(cardOpcoesSecretaria, "telaDefault");
            JOptionPane.showMessageDialog(null, "Nenhum paciente cadastrado", "Remover Paciente", JOptionPane.WARNING_MESSAGE);
        }else{
             DefaultListModel itensPaciente = new DefaultListModel();
             pacientes.forEach(itens -> {
                 itensPaciente.addElement(itens.getNome());
            });
            
             listaPacientes.setModel(itensPaciente);
        }
    }
    private void botaoRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoRemoverActionPerformed
        limparCampos(getContentPane());
        opcoesSec.show(cardOpcoesSecretaria, "removerPaciente");
        atualizarListaRemover();
        
    }//GEN-LAST:event_botaoRemoverActionPerformed

    public Component limparCampos(Component painel){
        
        if (painel instanceof JTextField) {
            JTextField ctrl = (JTextField) painel;
            ctrl.setText("");
        }
        
        if (painel instanceof JCheckBox) {
            JCheckBox ctrl = (JCheckBox) painel;
            ctrl.setSelected(false);
        }
        
        if(painel instanceof JSplitPane){
            for (Component entrarSplit : ((JSplitPane) painel).getComponents()) {
                limparCampos(entrarSplit);
            }
        }
        
        if (painel instanceof JPanel){
            for (Component entrarPanel : ((JPanel) painel).getComponents()) {
                limparCampos(entrarPanel);
            }
        }
        
        if(painel instanceof JCheckBox){
            for (Component entrarCheckbox : ((JCheckBox) painel).getComponents()){
                limparCampos(entrarCheckbox);
            }
        }
        
        grupoConvenio.clearSelection();
        grupoTipoConsulta.clearSelection();
        
        
        return painel;
    }
    
    public void atualizarCamposAlteracao(){
        
        if(pacientesBox.getSelectedIndex() != -1){
            
            grupoAtualizarConvenio.add(atualizaRadioParticular);
            grupoAtualizarConvenio.add(atualizaRadioPlanodeSaude);
            
            LocalDate attDataNasc = pacientes.get(pacientesBox.getSelectedIndex()).getLocalDateNasc();
            Calendar calendario = Calendar.getInstance();
            calendario.set(attDataNasc.getYear(), attDataNasc.getMonthValue()-1, attDataNasc.getDayOfMonth());
            
            int telefone = pacientes.get(pacientesBox.getSelectedIndex()).getTelefone();

            atualizaTelField.setText(String.valueOf(telefone));
            atualizaRuaField.setText(pacientes.get(pacientesBox.getSelectedIndex()).getRua());
            atualizaNomeField.setText(pacientes.get(pacientesBox.getSelectedIndex()).getNome());
            atualizaDataNascCalendar.setCalendar(calendario);
            atualizaCidadeField.setText(pacientes.get(pacientesBox.getSelectedIndex()).getCidade());
            atualizaBairroField.setText(pacientes.get(pacientesBox.getSelectedIndex()).getBairro());
            atualizaEmailField.setText(pacientes.get(pacientesBox.getSelectedIndex()).getEmail());
            
            if (pacientes.get(pacientesBox.getSelectedIndex()).getTipoPlano().equals("plano de sa??de")) 
                atualizaRadioPlanodeSaude.setSelected(true);
            else
                atualizaRadioParticular.setSelected(true);

        }
    }
    private void botaoRemoverPacActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoRemoverPacActionPerformed
        // TODO add your handling code here:
        consultas = sec.consultarConsultas();
        //int resposta = JOptionPane.showConfirmDialog(null, "Deseja mesmo remover esse paciente?", "Remo????o", JOptionPane.WARNING_MESSAGE);
        int resposta = JOptionPane.showConfirmDialog(null, "Deseja mesmo remover esse paciente?", "Remo????o", 1);
        if(resposta == 0){
            if(pacientes.get(listaPacientes.getSelectedIndex()).isConsultaCadastrada()){
            if(pacientes.get(listaPacientes.getSelectedIndex()).isConsultaCadastrada()){
                System.out.println("entrou cons");
                Consulta cons = pacientes.get(listaPacientes.getSelectedIndex()).getConsulta();
                pacientes.get(listaPacientes.getSelectedIndex()).setConsultaCadastrada(false);
                pacientes.get(listaPacientes.getSelectedIndex()).setConsulta(null);
                sec.atualizarPaciente(pacientes.get(listaPacientes.getSelectedIndex()));
                sec.removerConsulta(cons);
            }
            if (pacientes.get(listaPacientes.getSelectedIndex()).isDadosAdicionaisCadastrado()) {
                System.out.println("entrou dados");
                DadosAdicionais dados = pacientes.get(listaPacientes.getSelectedIndex()).getDadosAdicionais();
                pacientes.get(listaPacientes.getSelectedIndex()).setDadosAdicionaisCadastrado(false);
                pacientes.get(listaPacientes.getSelectedIndex()).setDadosAdicionais(null);
                sec.atualizarPaciente(pacientes.get(listaPacientes.getSelectedIndex()));
                sec.removerDadosPaciente(dados);
            }
            if (pacientes.get(listaPacientes.getSelectedIndex()).isProntuarioCadastrado()) {
                System.out.println("entrou pront");
                Prontuario pront = pacientes.get(listaPacientes.getSelectedIndex()).getProntuario();
                pacientes.get(listaPacientes.getSelectedIndex()).setProntuarioCadastrado(false);
                pacientes.get(listaPacientes.getSelectedIndex()).setProntuario(null);
                sec.atualizarPaciente(pacientes.get(listaPacientes.getSelectedIndex()));
                sec.removerProntuario(pront);
            }
            
            sec.removerPaciente(pacientes.get(listaPacientes.getSelectedIndex()));
            
            JOptionPane.showMessageDialog(null, "Paciente removido");
            atualizarListaRemover();
        }else if (resposta == 1)
            JOptionPane.showMessageDialog(null, "Paciente mantido");
        }
        
    }//GEN-LAST:event_botaoRemoverPacActionPerformed

    private void botaoVoltarConsvoltarMenuPrincipal(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoVoltarConsvoltarMenuPrincipal
        // TODO add your handling code here:
        limparCampos(getContentPane());
        menu.show(cardMenu, "menuSecretaria");
        opcoesSec.show(cardOpcoesSecretaria, "telaDefault");
    }//GEN-LAST:event_botaoVoltarConsvoltarMenuPrincipal
    public void atualizarListaRemoverCons(){
        consultas = sec.consultarConsultas();
        if (consultas.isEmpty()) {
            opcoesSec.show(cardOpcoesSecretaria, "telaDefault");
            JOptionPane.showMessageDialog(null, "Nenhuma consulta cadastrada", "Remover Consulta", JOptionPane.WARNING_MESSAGE);
        }else{
             DefaultListModel itensConsulta = new DefaultListModel();
             consultas.forEach(itens -> {
                 itensConsulta.addElement(itens.getPaciente().getNome());
            });
            
             listaCons.setModel(itensConsulta);
        }
    }
    private void botaoMenuRemoverConsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoMenuRemoverConsActionPerformed
        // TODO add your handling code here:
        limparCampos(getContentPane());
        opcoesSec.show(cardOpcoesSecretaria, "removerConsulta");
        atualizarListaRemoverCons();
    }//GEN-LAST:event_botaoMenuRemoverConsActionPerformed
    public void atualizarCamposConsAlteracao(){
        
        if(consBox.getSelectedIndex() != -1){
            
            consultas = sec.consultarConsultas();
            
            grupoAtualizarTipoPlano.add(atualizarRadioNormal);
            grupoAtualizarTipoPlano.add(atualizarRadioRetorno);

            LocalDate attDataCons = consultas.get(consBox.getSelectedIndex()).getLocalDateCons();
            Calendar calendario = Calendar.getInstance();
            calendario.set(attDataCons.getYear(), attDataCons.getMonthValue()-1, attDataCons.getDayOfMonth());

            int horario = consultas.get(consBox.getSelectedIndex()).getHorario();

            atualizarHorarioField.setText(String.valueOf(horario));
            atualizarMedicoField.setText(consultas.get(consBox.getSelectedIndex()).getMedico());
            nomePacienteConsField.setText(consultas.get(consBox.getSelectedIndex()).getPaciente().getNome());
            atualizarDataConsCalendar.setCalendar(calendario);

            if (consultas.get(consBox.getSelectedIndex()).getConsultaNormal().equals("normal")) 
                atualizarRadioNormal.setSelected(true);
            else
                atualizarRadioRetorno.setSelected(true);
        }
    }
    
    private void botaoMenuAtualizarConsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoMenuAtualizarConsActionPerformed
        // TODO add your handling code here:
        limparCampos(getContentPane());
        opcoesSec.show(cardOpcoesSecretaria, "atualizarConsulta");
        consultas = sec.consultarConsultas();
        
        atualizarComboBoxCons();
        atualizarCamposConsAlteracao();
        
    }//GEN-LAST:event_botaoMenuAtualizarConsActionPerformed
    
    public void atualizarComboBoxPacCons(){
        pacientesBoxCons.removeAllItems();
        limparCampos(getContentPane());
        
        if (pacientes.isEmpty()) {
            opcoesSec.show(cardOpcoesSecretaria, "telaDefault");
            JOptionPane.showMessageDialog(null, "Nenhum paciente cadastrado", "Cadastrar consulta", JOptionPane.WARNING_MESSAGE);
        }else {
            pacientes.forEach(pac -> {
                pacientesBoxCons.addItem(pac.getNome());
            });
        }
    }
    
    private void botaoMenuCadastrarConsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoMenuCadastrarConsActionPerformed
        // TODO add your handling code here:
        limparCampos(getContentPane());
        opcoesSec.show(cardOpcoesSecretaria, "cadastrarConsulta");
        pacientes = sec.consultarPacientes();
        
        for (int i = 0; i < pacientes.size(); i++) {

            if (pacientes.get(i).isConsultaCadastrada()) {
                pacientes.remove(i);
                i--;
            }
        }
        
        atualizarComboBoxPacCons();
        
    }//GEN-LAST:event_botaoMenuCadastrarConsActionPerformed
   
    private void botaoConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoConsultaActionPerformed
        menu.show(cardMenu, "menuGerenciarConsulta");
        atualizarCamposConsAlteracao();
    }//GEN-LAST:event_botaoConsultaActionPerformed

    private void consBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consBoxActionPerformed
        atualizarCamposConsAlteracao();
    }//GEN-LAST:event_consBoxActionPerformed

    private void atualizarRadioNormalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atualizarRadioNormalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_atualizarRadioNormalActionPerformed

    private void atualizarRadioRetornoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atualizarRadioRetornoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_atualizarRadioRetornoActionPerformed

    public void atualizarComboBoxCons(){
        consBox.removeAllItems();
        limparCampos(getContentPane());
        
        if (consultas.isEmpty()) {
            opcoesSec.show(cardOpcoesSecretaria, "telaDefault");
            JOptionPane.showMessageDialog(null, "Nenhuma consulta cadastrado", "Atualizar Consulta", JOptionPane.WARNING_MESSAGE);
        }else{
            consultas.forEach(itens -> {
                consBox.addItem(itens.getPaciente().getNome());
            });     
        }
    }
    
    private void botaoAtualizarConsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoAtualizarConsActionPerformed
        // TODO add your handling code here:
        Calendar dataSelecionada = atualizarDataConsCalendar.getCalendar();
        
        Consulta dadosAtualizadosCons = new Consulta();        

        dadosAtualizadosCons.setMedico(atualizarMedicoField.getText());
        dadosAtualizadosCons.setHorario(Integer.parseInt(atualizarHorarioField.getText()));
        dadosAtualizadosCons.setConsultaNormal(grupoAtualizarTipoPlano.getSelection().getActionCommand());
        dadosAtualizadosCons.setLocalDateCons(LocalDate.of(dataSelecionada.get(Calendar.YEAR),
                (dataSelecionada.get(Calendar.MONTH)+1),
                dataSelecionada.get(Calendar.DAY_OF_MONTH)));
        System.out.println(consBox.getSelectedIndex());
        dadosAtualizadosCons.setIdConsulta(consultas.get(consBox.getSelectedIndex()).getIdConsulta());
        dadosAtualizadosCons.setPaciente(consultas.get(consBox.getSelectedIndex()).getPaciente());
        
        sec.atualizarConsulta(dadosAtualizadosCons);
        JOptionPane.showMessageDialog(null, "Altera????o realizada com sucesso");
        atualizarComboBoxCons();
        atualizarCamposConsAlteracao();
    }//GEN-LAST:event_botaoAtualizarConsActionPerformed

    private void botaoRemoverConsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoRemoverConsActionPerformed
        // TODO add your handling code here:
        consultas = sec.consultarConsultas();
        int resposta = JOptionPane.showConfirmDialog(null, "Deseja mesmo remover essa consulta?", "Remo????o", 1);
        if(resposta == 0){
            int indexCons = consultas.get(listaCons.getSelectedIndex()).getIdConsulta();
            Consulta cons = sec.consultarUmaConsulta(indexCons);
            consultas.get(listaCons.getSelectedIndex()).getPaciente().setConsultaCadastrada(false);
            consultas.get(listaCons.getSelectedIndex()).getPaciente().setConsulta(null);
            sec.atualizarPaciente(consultas.get(listaCons.getSelectedIndex()).getPaciente());
            
            sec.removerConsulta(cons);            
            
            JOptionPane.showMessageDialog(null, "Consulta removida");
            atualizarListaRemoverCons();
        }else if (resposta == 1){
            JOptionPane.showMessageDialog(null, "Consulta mantida");
        }
    }//GEN-LAST:event_botaoRemoverConsActionPerformed

    private void botaoVoltarRelvoltarMenuPrincipal(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoVoltarRelvoltarMenuPrincipal
        // TODO add your handling code here:
        limparCampos(getContentPane());
        menu.show(cardMenu, "menuSecretaria");
        opcoesSec.show(cardOpcoesSecretaria, "telaDefault");
        
    }//GEN-LAST:event_botaoVoltarRelvoltarMenuPrincipal
    public void atualizarListaRelCons(){
        if (consultas.isEmpty()) {
            opcoesSec.show(cardOpcoesSecretaria, "telaDefault");
            JOptionPane.showMessageDialog(null, "Nenhuma consulta cadastrada", "Emitir Relatorio", JOptionPane.WARNING_MESSAGE);
        }else{
             DefaultListModel relConsultas = new DefaultListModel();
             for (Consulta cons : consultas) {
                 if (celularCheck.isSelected() && !emailCheck.isSelected() && cons.getPaciente().getTelefone() != 0) 
                    relConsultas.addElement(cons.getPaciente().getNome());
                 else if (!celularCheck.isSelected() && emailCheck.isSelected() && !cons.getPaciente().getEmail().equals(""))
                    relConsultas.addElement(cons.getPaciente().getNome());
                 else if(celularCheck.isSelected() && emailCheck.isSelected() && cons.getPaciente().getTelefone() != 0 && !cons.getPaciente().getEmail().equals(""))
                    relConsultas.addElement(cons.getPaciente().getNome());
                else if(!celularCheck.isSelected() && !emailCheck.isSelected())
                    relConsultas.addElement(cons.getPaciente().getNome());

            }
             listaRelCons.setModel(relConsultas);
        }
    }
    public void removerPacSemCons(){
       for (int i = 0; i < consultas.size(); i++) {
            if (!consultas.get(i).getLocalDateCons().equals(LocalDate.now().plusDays(1))) {
                consultas.remove(i);
                i--;
            }
        }
    }
    private void botaoMenuEmitirRelConsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoMenuEmitirRelConsActionPerformed
        // TODO add your handling code here:
        opcoesSec.show(cardOpcoesSecretaria, "emitirRelatorioCons");
        consultas = sec.consultarConsultas();
        consProximoDiaField.setText(LocalDate.now().plusDays(1).format(toBarras));        
        removerPacSemCons();
        atualizarListaRelCons();
    }//GEN-LAST:event_botaoMenuEmitirRelConsActionPerformed

    private void consProximoDiaFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consProximoDiaFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_consProximoDiaFieldActionPerformed

    private void celularCheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_celularCheckActionPerformed
        // TODO add your handling code here:
        consultas = sec.consultarConsultas();
        removerPacSemCons();
        for (int i = 0; i < consultas.size(); i++) {
            if (celularCheck.isSelected() || !consultas.get(i).getLocalDateCons().equals(LocalDate.now().plusDays(1))) {
                if (consultas.get(i).getPaciente().getTelefone() == 0) {
                    consultas.remove(i);
                    i--;
                }
            }
        }
        atualizarListaRelCons();
    }//GEN-LAST:event_celularCheckActionPerformed

    private void emailCheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailCheckActionPerformed
        // TODO add your handling code here:
        consultas = sec.consultarConsultas();
        removerPacSemCons();
        for (int i = 0; i < consultas.size(); i++) {
            if (emailCheck.isSelected() || !consultas.get(i).getLocalDateCons().equals(LocalDate.now().plusDays(1))) {
                if (consultas.get(i).getPaciente().getEmail().equals("")) {
                    consultas.remove(i);
                    i--;
                }
            }                
        }
        atualizarListaRelCons();
    }//GEN-LAST:event_emailCheckActionPerformed

    private void atualizaEmailFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atualizaEmailFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_atualizaEmailFieldActionPerformed

    private void botaoAtualizarDadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoAtualizarDadosActionPerformed
        // TODO add your handling code here:

        Calendar dataSelecionada = atualizaDataNascCalendar.getCalendar();

        Paciente dadosAtualizados = new Paciente();

        dadosAtualizados.setNome(atualizaNomeField.getText());
        if (atualizaTelField.getText().equals(""))
            dadosAtualizados.setTelefone(0);
        else
            dadosAtualizados.setTelefone(Integer.parseInt(atualizaTelField.getText()));
        
        dadosAtualizados.setBairro(atualizaBairroField.getText());
        dadosAtualizados.setCidade(atualizaCidadeField.getText());
        dadosAtualizados.setRua(atualizaRuaField.getText());
        dadosAtualizados.setEmail(atualizaEmailField.getText());
        dadosAtualizados.setTipoPlano(grupoAtualizarConvenio.getSelection().getActionCommand());
        dadosAtualizados.setLocalDateNasc(LocalDate.of(dataSelecionada.get(Calendar.YEAR),
            (dataSelecionada.get(Calendar.MONTH)+1),
            dataSelecionada.get(Calendar.DAY_OF_MONTH)));

        dadosAtualizados.setIdPaciente(pacientes.get(pacientesBox.getSelectedIndex()).getIdPaciente());

        if (pacientes.get(pacientesBox.getSelectedIndex()).getConsulta() != null) {
            dadosAtualizados.setConsulta(pacientes.get(pacientesBox.getSelectedIndex()).getConsulta());
            dadosAtualizados.setConsultaCadastrada(true);
        }

        sec.atualizarPaciente(dadosAtualizados);
        JOptionPane.showMessageDialog(null, "Altera????o realizada com sucesso");
        atualizarComboBoxPacientes();
        atualizarCamposAlteracao();
    }//GEN-LAST:event_botaoAtualizarDadosActionPerformed

    private void atualizaRadioParticularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atualizaRadioParticularActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_atualizaRadioParticularActionPerformed

    private void atualizaBairroFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atualizaBairroFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_atualizaBairroFieldActionPerformed

    private void pacientesBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pacientesBoxActionPerformed
        atualizarCamposAlteracao();
    }//GEN-LAST:event_pacientesBoxActionPerformed

    private void emailFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailFieldActionPerformed

    private void botaoSalvarDadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoSalvarDadosActionPerformed

        Calendar dataSelecionada = dataNascCalendar.getCalendar();

        Paciente pacienteNovo = new Paciente();

        pacienteNovo.setNome(nomeField.getText());
        pacienteNovo.setBairro(bairroField.getText());
        pacienteNovo.setCidade(cidadeField.getText());
        pacienteNovo.setRua(ruaField.getText());
        pacienteNovo.setEmail(emailField.getText());
        
        if (telField.getText().equals(""))
            pacienteNovo.setTelefone(0);
        else
            pacienteNovo.setTelefone(Integer.parseInt(telField.getText()));
        pacienteNovo.setLocalDateNasc(LocalDate.of(dataSelecionada.get(Calendar.YEAR),
            (dataSelecionada.get(Calendar.MONTH)+1),
            dataSelecionada.get(Calendar.DAY_OF_MONTH)));
        
        pacienteNovo.setTipoPlano(grupoConvenio.getSelection().getActionCommand());
        sec.cadastrarPaciente(pacienteNovo);
        JOptionPane.showMessageDialog(null, "Cadastro realizado com sucesso");
        limparCampos(getContentPane());

    }//GEN-LAST:event_botaoSalvarDadosActionPerformed

    private void radioPlanodeSaudeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioPlanodeSaudeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radioPlanodeSaudeActionPerformed

    private void radioParticularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioParticularActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radioParticularActionPerformed

    private void bairroFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bairroFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bairroFieldActionPerformed

    private void botaoSalvarConsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoSalvarConsActionPerformed
        // TODO add your handling code here:
        Calendar dataSelecionada = dataConsCalendar.getCalendar();

        grupoTipoConsulta.add(radioNormal);
        grupoTipoConsulta.add(radioRetorno);

        Consulta novaCons = new Consulta();

        novaCons.setConsultaNormal(grupoTipoConsulta.getSelection().getActionCommand());
        novaCons.setHorario(Integer.parseInt(horarioField.getText()));
        novaCons.setMedico(medicoField.getText());
        novaCons.setLocalDateCons(LocalDate.of(dataSelecionada.get(Calendar.YEAR),
            (dataSelecionada.get(Calendar.MONTH)+1),
            dataSelecionada.get(Calendar.DAY_OF_MONTH)));

        pacientes.get(pacientesBoxCons.getSelectedIndex()).setConsulta(novaCons);
        novaCons.setPaciente(pacientes.get(pacientesBoxCons.getSelectedIndex()));
        novaCons.getPaciente().setConsultaCadastrada(true);

        sec.cadastrarConsulta(novaCons);
        sec.atualizarPaciente(pacientes.get(pacientesBoxCons.getSelectedIndex()));
        JOptionPane.showMessageDialog(null, "Consulta cadastrada com sucesso.");

        pacientes.remove(pacientesBoxCons.getSelectedIndex());
        pacientesBoxCons.removeItemAt(pacientesBoxCons.getSelectedIndex());

        limparCampos(getContentPane());
        atualizarComboBoxPacCons();
    }//GEN-LAST:event_botaoSalvarConsActionPerformed

    private void radioRetornoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioRetornoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radioRetornoActionPerformed

    private void radioNormalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioNormalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radioNormalActionPerformed

    private void pacientesBoxConsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pacientesBoxConsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pacientesBoxConsActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(UISecretaria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UISecretaria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UISecretaria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UISecretaria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UISecretaria().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel JPanelDataChecks;
    private javax.swing.JTextField atualizaBairroField;
    private javax.swing.JTextField atualizaCidadeField;
    private com.toedter.calendar.JDateChooser atualizaDataNascCalendar;
    private javax.swing.JTextField atualizaEmailField;
    private javax.swing.JTextField atualizaNomeField;
    private javax.swing.JRadioButton atualizaRadioParticular;
    private javax.swing.JRadioButton atualizaRadioPlanodeSaude;
    private javax.swing.JTextField atualizaRuaField;
    private javax.swing.JTextField atualizaTelField;
    private javax.swing.JPanel atualizarConsulta;
    private com.toedter.calendar.JDateChooser atualizarDataConsCalendar;
    private javax.swing.JTextField atualizarHorarioField;
    private javax.swing.JTextField atualizarMedicoField;
    private javax.swing.JPanel atualizarPaciente;
    private javax.swing.JRadioButton atualizarRadioNormal;
    private javax.swing.JRadioButton atualizarRadioRetorno;
    private javax.swing.JTextField bairroField;
    private javax.swing.JButton botaoAtualizar;
    private javax.swing.JButton botaoAtualizarCons;
    private javax.swing.JButton botaoAtualizarDados;
    private javax.swing.JButton botaoCadastrar;
    private javax.swing.JButton botaoConsulta;
    private javax.swing.JButton botaoMenuAtualizarCons;
    private javax.swing.JButton botaoMenuCadastrarCons;
    private javax.swing.JButton botaoMenuEmitirRelCons;
    private javax.swing.JButton botaoMenuRemoverCons;
    private javax.swing.JButton botaoPaciente;
    private javax.swing.JButton botaoRelatorio;
    private javax.swing.JButton botaoRemover;
    private javax.swing.JButton botaoRemoverCons;
    private javax.swing.JButton botaoRemoverPac;
    private javax.swing.JButton botaoSalvarCons;
    private javax.swing.JButton botaoSalvarDados;
    private javax.swing.JButton botaoVoltarCons;
    private javax.swing.JButton botaoVoltarMain;
    private javax.swing.JButton botaoVoltarRel;
    private javax.swing.JButton botaoVoltarSec;
    private javax.swing.JPanel cadastrarConsulta;
    private javax.swing.JPanel cadastrarPaciente;
    private javax.swing.JPanel cardMenu;
    private javax.swing.JPanel cardOpcoesSecretaria;
    private javax.swing.JCheckBox celularCheck;
    private javax.swing.JTextField cidadeField;
    private javax.swing.JComboBox consBox;
    private javax.swing.JTextField consProximoDiaField;
    private com.toedter.calendar.JDateChooser dataConsCalendar;
    private com.toedter.calendar.JDateChooser dataNascCalendar;
    private javax.swing.JCheckBox emailCheck;
    private javax.swing.JTextField emailField;
    private javax.swing.JPanel emitirRelatorioCons;
    private javax.swing.Box.Filler filler1;
    private javax.swing.Box.Filler filler18;
    private javax.swing.Box.Filler filler2;
    private javax.swing.Box.Filler filler3;
    private javax.swing.Box.Filler filler4;
    private javax.swing.Box.Filler filler5;
    private javax.swing.Box.Filler filler6;
    private javax.swing.ButtonGroup grupoConvenio;
    private javax.swing.JTextField horarioField;
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
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSplitPane jSplitPane2;
    private javax.swing.JList<String> listaCons;
    private javax.swing.JList<String> listaPacientes;
    private javax.swing.JList<String> listaRelCons;
    private javax.swing.JTextField medicoField;
    private javax.swing.JPanel menuGerenciarConsulta;
    private javax.swing.JPanel menuGerenciarPaciente;
    private javax.swing.JPanel menuGerenciarRel;
    private javax.swing.JPanel menuSecretaria;
    private javax.swing.JTextField nomeField;
    private javax.swing.JTextField nomePacienteConsField;
    private javax.swing.JComboBox pacientesBox;
    private javax.swing.JComboBox pacientesBoxCons;
    private javax.swing.JPanel painelAtualizaBairro;
    private javax.swing.JPanel painelAtualizaCidade;
    private javax.swing.JPanel painelAtualizaConvenio;
    private javax.swing.JPanel painelAtualizaData;
    private javax.swing.JPanel painelAtualizaEmail;
    private javax.swing.JPanel painelAtualizaNome;
    private javax.swing.JPanel painelAtualizaRua;
    private javax.swing.JPanel painelAtualizaTelefone;
    private javax.swing.JPanel painelAtualizar;
    private javax.swing.JPanel painelAtualizarDataCons;
    private javax.swing.JPanel painelAtualizarHorario;
    private javax.swing.JPanel painelAtualizarMedico;
    private javax.swing.JPanel painelAtualizarTipoCons;
    private javax.swing.JPanel painelBairro;
    private javax.swing.JPanel painelBotaoAtualizarCons;
    private javax.swing.JPanel painelCidade;
    private javax.swing.JPanel painelConvenio;
    private javax.swing.JPanel painelData;
    private javax.swing.JPanel painelDataCons;
    private javax.swing.JPanel painelEmail;
    private javax.swing.JPanel painelEmitirRelCons;
    private javax.swing.JPanel painelExcluirConsulta;
    private javax.swing.JPanel painelExcluirPaciente;
    private javax.swing.JPanel painelHorario;
    private javax.swing.JPanel painelMedico;
    private javax.swing.JPanel painelNome;
    private javax.swing.JPanel painelNomePaciente;
    private javax.swing.JPanel painelPacCons;
    private javax.swing.JPanel painelRemover;
    private javax.swing.JPanel painelRemoverCons;
    private javax.swing.JPanel painelRua;
    private javax.swing.JPanel painelSalvar;
    private javax.swing.JPanel painelSalvarCons;
    private javax.swing.JPanel painelSelecicionarCons;
    private javax.swing.JPanel painelSelecionarPaciente;
    private javax.swing.JPanel painelTelefone;
    private javax.swing.JPanel painelTipoCons;
    private javax.swing.JRadioButton radioNormal;
    private javax.swing.JRadioButton radioParticular;
    private javax.swing.JRadioButton radioPlanodeSaude;
    private javax.swing.JRadioButton radioRetorno;
    private javax.swing.JPanel removerConsulta;
    private javax.swing.JPanel removerPaciente;
    private javax.swing.JTextField ruaField;
    private javax.swing.JTextField telField;
    private javax.swing.JPanel telaDefault;
    // End of variables declaration//GEN-END:variables
}
