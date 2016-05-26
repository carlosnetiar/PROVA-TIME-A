VERSION 5.00
Object = "{6B7E6392-850A-101B-AFC0-4210102A8DA7}#1.3#0"; "COMCTL32.OCX"
Begin VB.Form frmAteCadHorario 
   Caption         =   "SIAG"
   ClientHeight    =   4155
   ClientLeft      =   120
   ClientTop       =   450
   ClientWidth     =   7845
   LinkTopic       =   "Form1"
   ScaleHeight     =   4155
   ScaleWidth      =   7845
   StartUpPosition =   3  'Windows Default
   Begin ComctlLib.Toolbar tooAteCadHorIcone 
      Align           =   1  'Align Top
      Height          =   660
      Left            =   0
      TabIndex        =   9
      Top             =   0
      Width           =   7845
      _ExtentX        =   13838
      _ExtentY        =   1164
      ButtonWidth     =   1032
      ButtonHeight    =   1005
      Appearance      =   1
      ImageList       =   "ImageList1"
      _Version        =   327682
      BeginProperty Buttons {0713E452-850A-101B-AFC0-4210102A8DA7} 
         NumButtons      =   4
         BeginProperty Button1 {0713F354-850A-101B-AFC0-4210102A8DA7} 
            Object.Tag             =   "Novo"
            ImageIndex      =   1
         EndProperty
         BeginProperty Button2 {0713F354-850A-101B-AFC0-4210102A8DA7} 
            Object.Tag             =   "Editar"
            ImageIndex      =   2
         EndProperty
         BeginProperty Button3 {0713F354-850A-101B-AFC0-4210102A8DA7} 
            Object.Tag             =   "Salvar"
            ImageIndex      =   3
         EndProperty
         BeginProperty Button4 {0713F354-850A-101B-AFC0-4210102A8DA7} 
            Object.Tag             =   "Sair"
            ImageIndex      =   4
         EndProperty
      EndProperty
   End
   Begin VB.Frame fraAteCadHorario 
      Caption         =   "Cadastro de Horário"
      Height          =   3255
      Left            =   240
      TabIndex        =   0
      Top             =   720
      Width           =   7455
      Begin VB.ComboBox comAteCadHorHora 
         Height          =   315
         Left            =   1200
         TabIndex        =   8
         Top             =   2520
         Width           =   1695
      End
      Begin VB.ComboBox comAteCadHorData 
         Height          =   315
         Left            =   1200
         TabIndex        =   7
         Top             =   1800
         Width           =   2175
      End
      Begin VB.TextBox txtAteCadHorCPF 
         Height          =   375
         Left            =   1200
         TabIndex        =   6
         Top             =   1080
         Width           =   2415
      End
      Begin VB.TextBox txtAteCadHorNome 
         Height          =   405
         Left            =   1200
         TabIndex        =   5
         Top             =   480
         Width           =   4455
      End
      Begin ComctlLib.ImageList ImageList1 
         Left            =   6480
         Top             =   2520
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
               Picture         =   "frmAteCadHorario.frx":0000
               Key             =   ""
            EndProperty
            BeginProperty ListImage2 {0713E8C3-850A-101B-AFC0-4210102A8DA7} 
               Picture         =   "frmAteCadHorario.frx":11F582
               Key             =   ""
            EndProperty
            BeginProperty ListImage3 {0713E8C3-850A-101B-AFC0-4210102A8DA7} 
               Picture         =   "frmAteCadHorario.frx":1447F8
               Key             =   ""
            EndProperty
            BeginProperty ListImage4 {0713E8C3-850A-101B-AFC0-4210102A8DA7} 
               Picture         =   "frmAteCadHorario.frx":263D7A
               Key             =   ""
            EndProperty
         EndProperty
      End
      Begin VB.Label lblAteCadHorHora 
         Caption         =   "Hora"
         Height          =   255
         Left            =   360
         TabIndex        =   4
         Top             =   2520
         Width           =   615
      End
      Begin VB.Label lblAteCadHorData 
         Caption         =   "Data"
         Height          =   255
         Left            =   360
         TabIndex        =   3
         Top             =   1920
         Width           =   495
      End
      Begin VB.Label lblAteCadHorCPF 
         Caption         =   "CPF"
         Height          =   255
         Left            =   360
         TabIndex        =   2
         Top             =   1200
         Width           =   495
      End
      Begin VB.Label lblAteCadHorNome 
         Caption         =   "Nome"
         Height          =   255
         Left            =   360
         TabIndex        =   1
         Top             =   600
         Width           =   615
      End
   End
End
Attribute VB_Name = "frmAteCadHorario"
Attribute VB_GlobalNameSpace = False
Attribute VB_Creatable = False
Attribute VB_PredeclaredId = True
Attribute VB_Exposed = False
Private Sub btoAteCadHorSalvar_Click()
    MsgBox "Salvo com Sucesso", vbInformation, "SIAG"
End Sub


Private Sub fraAteCadHorario_DragDrop(Source As Control, X As Single, Y As Single)

End Sub

Private Sub tooAteCadHorIcone_ButtonClick(ByVal Button As ComctlLib.Button)
Select Case Button.Index
        Case 1
            'Novo Arquivo
        Case 2
            'Abrir arquivo
        Case 3
            'Insert
        Case 4
            Unload frmAteCadHorario
    End Select
End Sub

