VERSION 5.00
Object = "{6B7E6392-850A-101B-AFC0-4210102A8DA7}#1.3#0"; "COMCTL32.OCX"
Object = "{86CF1D34-0C5F-11D2-A9FC-0000F8754DA1}#2.0#0"; "MSCOMCT2.OCX"
Begin VB.Form frmSupCadAtendente 
   BorderStyle     =   3  'Fixed Dialog
   Caption         =   "SIAG"
   ClientHeight    =   5655
   ClientLeft      =   45
   ClientTop       =   375
   ClientWidth     =   8010
   LinkTopic       =   "Form1"
   MaxButton       =   0   'False
   MDIChild        =   -1  'True
   MinButton       =   0   'False
   ScaleHeight     =   5655
   ScaleWidth      =   8010
   ShowInTaskbar   =   0   'False
   Begin ComctlLib.Toolbar tooSupCadAteIcone 
      Align           =   1  'Align Top
      Height          =   660
      Left            =   0
      TabIndex        =   0
      Top             =   0
      Width           =   8010
      _ExtentX        =   14129
      _ExtentY        =   1164
      ButtonWidth     =   1032
      ButtonHeight    =   1005
      Appearance      =   1
      ImageList       =   "ImageList1"
      _Version        =   327682
      BeginProperty Buttons {0713E452-850A-101B-AFC0-4210102A8DA7} 
         NumButtons      =   4
         BeginProperty Button1 {0713F354-850A-101B-AFC0-4210102A8DA7} 
            Object.Tag             =   "NOVO"
            ImageIndex      =   1
         EndProperty
         BeginProperty Button2 {0713F354-850A-101B-AFC0-4210102A8DA7} 
            Object.Tag             =   "EDITAR"
            ImageIndex      =   2
         EndProperty
         BeginProperty Button3 {0713F354-850A-101B-AFC0-4210102A8DA7} 
            Object.Tag             =   "SALVAR"
            ImageIndex      =   3
         EndProperty
         BeginProperty Button4 {0713F354-850A-101B-AFC0-4210102A8DA7} 
            Object.Tag             =   "SAIR"
            ImageIndex      =   4
         EndProperty
      EndProperty
   End
   Begin VB.Frame fraSupCadAtendente 
      Caption         =   "Cadastro de Atendente"
      Height          =   4815
      Left            =   120
      TabIndex        =   1
      Top             =   720
      Width           =   7695
      Begin MSComCtl2.DTPicker DTPickerDatadeNascimento 
         Height          =   375
         Left            =   1320
         TabIndex        =   9
         Tag             =   "OBRIGATORIO"
         Top             =   2280
         Width           =   2295
         _ExtentX        =   4048
         _ExtentY        =   661
         _Version        =   393216
         Format          =   94437377
         CurrentDate     =   42517
      End
      Begin VB.TextBox txtSupCadAteNome 
         Height          =   375
         Left            =   1320
         TabIndex        =   4
         Tag             =   "OBRIGATORIO"
         Top             =   480
         Width           =   5415
      End
      Begin VB.TextBox txtSupCadAteCPF 
         Height          =   375
         Left            =   1320
         TabIndex        =   3
         Tag             =   "OBRIGATORIO"
         Top             =   1440
         Width           =   2655
      End
      Begin VB.ComboBox comSupCadAteGuiche 
         Height          =   315
         Left            =   1320
         TabIndex        =   2
         Top             =   3240
         Width           =   1455
      End
      Begin VB.Label lblNome 
         Caption         =   "Nome"
         ForeColor       =   &H000000FF&
         Height          =   375
         Left            =   360
         TabIndex        =   8
         Top             =   600
         Width           =   615
      End
      Begin VB.Label lblCPF 
         Caption         =   "CPF"
         ForeColor       =   &H000000FF&
         Height          =   375
         Left            =   360
         TabIndex        =   7
         Top             =   1440
         Width           =   615
      End
      Begin VB.Label lblDatadeNascimento 
         Caption         =   "Data de Nascimento"
         ForeColor       =   &H000000FF&
         Height          =   375
         Left            =   360
         TabIndex        =   6
         Top             =   2280
         Width           =   855
      End
      Begin VB.Label lblguiche 
         Caption         =   "Guichê"
         ForeColor       =   &H00000000&
         Height          =   375
         Left            =   360
         TabIndex        =   5
         Top             =   3240
         Width           =   615
      End
      Begin ComctlLib.ImageList ImageList1 
         Left            =   6840
         Top             =   4200
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
               Picture         =   "frmSupCadAtendente.frx":0000
               Key             =   ""
            EndProperty
            BeginProperty ListImage2 {0713E8C3-850A-101B-AFC0-4210102A8DA7} 
               Picture         =   "frmSupCadAtendente.frx":11F582
               Key             =   ""
            EndProperty
            BeginProperty ListImage3 {0713E8C3-850A-101B-AFC0-4210102A8DA7} 
               Picture         =   "frmSupCadAtendente.frx":1447F8
               Key             =   ""
            EndProperty
            BeginProperty ListImage4 {0713E8C3-850A-101B-AFC0-4210102A8DA7} 
               Picture         =   "frmSupCadAtendente.frx":263D7A
               Key             =   ""
            EndProperty
         EndProperty
      End
   End
End
Attribute VB_Name = "frmSupCadAtendente"
Attribute VB_GlobalNameSpace = False
Attribute VB_Creatable = False
Attribute VB_PredeclaredId = True
Attribute VB_Exposed = False
Private Sub btoSupCadAtesalvar_Click()
    MsgBox "Salvo com Sucesso", vbInformation, "SIAG"
End Sub

Private Sub Form_Load()
    comSupCadAteGuiche.AddItem "1", 0
    comSupCadAteGuiche.AddItem "2", 1
    comSupCadAteGuiche.AddItem "3", 2
    comSupCadAteGuiche.AddItem "4", 3
    comSupCadAteGuiche.AddItem "5", 4
    comSupCadAteGuiche.AddItem "6", 5

End Sub

Private Sub tooSupCadAteIcone_ButtonClick(ByVal Button As ComctlLib.Button)
     Select Case Button.Index
        Case 1
            novo
        Case 2
            'Abrir arquivo
        Case 3
            Salvar
        Case 4
            Unload frmSupCadAtendente
    End Select
End Sub

Private Sub Salvar()
    If FG_ValidaForm(Me) Then
    End If
End Sub

Private Sub novo()
    Call PG_LimpaForm(Me, txtCadAteNome)
End Sub
