VERSION 5.00
Object = "{6B7E6392-850A-101B-AFC0-4210102A8DA7}#1.3#0"; "COMCTL32.OCX"
Object = "{86CF1D34-0C5F-11D2-A9FC-0000F8754DA1}#2.0#0"; "MSCOMCT2.OCX"
Begin VB.Form frmSerPresencial 
   BorderStyle     =   3  'Fixed Dialog
   Caption         =   "SIAG"
   ClientHeight    =   7320
   ClientLeft      =   45
   ClientTop       =   375
   ClientWidth     =   10575
   LinkTopic       =   "Form1"
   MaxButton       =   0   'False
   MDIChild        =   -1  'True
   MinButton       =   0   'False
   ScaleHeight     =   7320
   ScaleWidth      =   10575
   ShowInTaskbar   =   0   'False
   Begin ComctlLib.Toolbar tooSerPreIcone 
      Align           =   1  'Align Top
      Height          =   660
      Left            =   0
      TabIndex        =   13
      Top             =   0
      Width           =   10575
      _ExtentX        =   18653
      _ExtentY        =   1164
      ButtonWidth     =   1032
      ButtonHeight    =   1005
      Appearance      =   1
      ImageList       =   "ImageList2"
      _Version        =   327682
      BeginProperty Buttons {0713E452-850A-101B-AFC0-4210102A8DA7} 
         NumButtons      =   4
         BeginProperty Button1 {0713F354-850A-101B-AFC0-4210102A8DA7} 
            Key             =   "NOVO"
            Object.Tag             =   "Novo"
            ImageIndex      =   1
         EndProperty
         BeginProperty Button2 {0713F354-850A-101B-AFC0-4210102A8DA7} 
            Key             =   "EDITAR"
            Object.Tag             =   "Editar"
            ImageIndex      =   2
         EndProperty
         BeginProperty Button3 {0713F354-850A-101B-AFC0-4210102A8DA7} 
            Key             =   "SALVAR"
            Object.Tag             =   "Salvar"
            ImageIndex      =   3
         EndProperty
         BeginProperty Button4 {0713F354-850A-101B-AFC0-4210102A8DA7} 
            Key             =   "SAIR"
            Object.Tag             =   "Sair"
            ImageIndex      =   4
         EndProperty
      EndProperty
   End
   Begin VB.Frame fraSerPreAluno 
      Caption         =   "Informações do Aluno"
      Height          =   2175
      Left            =   1080
      TabIndex        =   10
      Top             =   720
      Width           =   8295
      Begin VB.CommandButton Command1 
         Caption         =   "Command1"
         Height          =   375
         Left            =   3840
         TabIndex        =   17
         Top             =   360
         Width           =   975
      End
      Begin VB.TextBox txtNomePresencial 
         Enabled         =   0   'False
         Height          =   375
         Left            =   960
         TabIndex        =   16
         Top             =   1200
         Width           =   4695
      End
      Begin VB.TextBox txtSerPreCPF 
         Height          =   405
         Left            =   960
         TabIndex        =   11
         Top             =   360
         Width           =   2775
      End
      Begin VB.Label lblSerPreNome 
         Caption         =   "Nome"
         ForeColor       =   &H00000000&
         Height          =   255
         Left            =   360
         TabIndex        =   15
         Top             =   1200
         Width           =   735
      End
      Begin VB.Label lblSerPreCPF 
         Caption         =   "CPF"
         ForeColor       =   &H000000FF&
         Height          =   255
         Left            =   360
         TabIndex        =   12
         Top             =   480
         Width           =   495
      End
   End
   Begin VB.Frame fraSerFeedBack 
      Caption         =   "FeedBack"
      Height          =   1335
      Left            =   1080
      TabIndex        =   5
      Top             =   5640
      Width           =   8295
      Begin VB.ComboBox comSerPreAluno 
         Height          =   315
         Left            =   1440
         TabIndex        =   7
         Tag             =   "OBRIGATORIO"
         Top             =   600
         Width           =   1575
      End
      Begin VB.Label lblSerPreAluno 
         Caption         =   "Aluno"
         ForeColor       =   &H000000FF&
         Height          =   255
         Left            =   360
         TabIndex        =   6
         Top             =   600
         Width           =   1095
      End
   End
   Begin VB.Frame fraSerPreServico 
      Caption         =   "Serviço"
      Height          =   2295
      Left            =   1080
      TabIndex        =   0
      Top             =   3120
      Width           =   8295
      Begin MSComCtl2.DTPicker DTPickerServico 
         Height          =   375
         Left            =   1440
         TabIndex        =   14
         Tag             =   "OBRIGATORIO"
         Top             =   1080
         Width           =   2055
         _ExtentX        =   3625
         _ExtentY        =   661
         _Version        =   393216
         Format          =   93978625
         CurrentDate     =   42517
      End
      Begin VB.ComboBox comSerPreHora 
         Height          =   315
         Left            =   1440
         TabIndex        =   9
         Tag             =   "OBRIGATORIO"
         Top             =   1800
         Width           =   2055
      End
      Begin VB.ComboBox comSerPreServiço 
         Height          =   315
         Left            =   1440
         TabIndex        =   8
         Top             =   360
         Width           =   4335
      End
      Begin VB.Label lblSerPreHora 
         Caption         =   "Hora"
         ForeColor       =   &H000000FF&
         Height          =   255
         Left            =   360
         TabIndex        =   4
         Top             =   1800
         Width           =   615
      End
      Begin VB.Label lblSerPreData 
         Caption         =   "Data"
         ForeColor       =   &H000000FF&
         Height          =   255
         Left            =   360
         TabIndex        =   3
         Top             =   1200
         Width           =   495
      End
      Begin VB.Label Label4 
         Caption         =   "Serviço"
         Height          =   255
         Left            =   360
         TabIndex        =   1
         Top             =   480
         Width           =   615
      End
   End
   Begin ComctlLib.ImageList ImageList2 
      Left            =   9720
      Top             =   6720
      _ExtentX        =   1005
      _ExtentY        =   1005
      BackColor       =   -2147483643
      ImageWidth      =   32
      ImageHeight     =   32
      MaskColor       =   12632256
      _Version        =   327682
      BeginProperty Images {0713E8C2-850A-101B-AFC0-4210102A8DA7} 
         NumListImages   =   4
         BeginProperty ListImage1 {0713E8C3-850A-101B-AFC0-4210102A8DA7} 
            Picture         =   "frmSerPresencial.frx":0000
            Key             =   ""
         EndProperty
         BeginProperty ListImage2 {0713E8C3-850A-101B-AFC0-4210102A8DA7} 
            Picture         =   "frmSerPresencial.frx":11F582
            Key             =   ""
         EndProperty
         BeginProperty ListImage3 {0713E8C3-850A-101B-AFC0-4210102A8DA7} 
            Picture         =   "frmSerPresencial.frx":1447F8
            Key             =   ""
         EndProperty
         BeginProperty ListImage4 {0713E8C3-850A-101B-AFC0-4210102A8DA7} 
            Picture         =   "frmSerPresencial.frx":263D7A
            Key             =   ""
         EndProperty
      EndProperty
   End
   Begin ComctlLib.ImageList ImageList1 
      Left            =   5040
      Top             =   3360
      _ExtentX        =   1005
      _ExtentY        =   1005
      BackColor       =   -2147483643
      MaskColor       =   12632256
      _Version        =   327682
   End
   Begin VB.Label Label5 
      Caption         =   "Label5"
      Height          =   495
      Left            =   4680
      TabIndex        =   2
      Top             =   3240
      Width           =   1215
   End
End
Attribute VB_Name = "frmSerPresencial"
Attribute VB_GlobalNameSpace = False
Attribute VB_Creatable = False
Attribute VB_PredeclaredId = True
Attribute VB_Exposed = False
Private Sub btoSerPreRegistrarAtendimento_Click()
    MsgBox "Registro Salvo", vbInformation, "SIAG"
End Sub

Private Sub Command1_Click()
            Dim adosisagenda As ADODB.Recordset
            Dim sql As String
            
            sql = "SELECT nome_aluno FROM tbl_aluno WHERE cpf_aluno='" & txtSerPreCPF & "'"
            Set adosisagenda = abrirconexao("DRIVER={MySQL ODBC 3.51 Driver};SERVER=localhost;DATABASE=sisagenda;UID=root;PWD=123456; OPTION=3").Execute(sql)
            MsgBox "Cadastro Concluído ! GRAÇAS A DEUS", vbInformation + vbOKOnly, App.Title
End Sub

Private Sub Form_Load()
    'Hora
    comSerPreHora.AddItem "09:00", 0
    comSerPreHora.AddItem "10:00", 1
    comSerPreHora.AddItem "11:00", 2
    comSerPreHora.AddItem "12:00", 3
    comSerPreHora.AddItem "14:00", 4
    comSerPreHora.AddItem "15:00", 5
    comSerPreHora.AddItem "16:00", 6
    comSerPreHora.AddItem "17:00", 7
    comSerPreHora.AddItem "18:00", 8
    
    'FeedBack do Aluno
    comSerPreAluno.AddItem "1", 0
    comSerPreAluno.AddItem "2", 1
    comSerPreAluno.AddItem "3", 2
    comSerPreAluno.AddItem "4", 3
    comSerPreAluno.AddItem "5", 4

End Sub

Private Sub tooSerPreIcone_ButtonClick(ByVal Button As ComctlLib.Button)
Select Case Button.Index
        Case 1
            novo
        Case 2
            'Abrir arquivo
        Case 3
            Salvar
        Case 4
            Unload frmSerPresencial
    End Select
End Sub

Private Sub Salvar()
    If FG_ValidaForm(Me) Then
    End If
End Sub

Private Sub novo()
    Call PG_LimpaForm(Me, txtSerPreNome)
End Sub
