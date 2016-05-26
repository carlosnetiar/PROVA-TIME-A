VERSION 5.00
Object = "{6B7E6392-850A-101B-AFC0-4210102A8DA7}#1.3#0"; "COMCTL32.OCX"
Begin VB.Form frmSerPresencial 
   Caption         =   "SIAG"
   ClientHeight    =   7320
   ClientLeft      =   120
   ClientTop       =   450
   ClientWidth     =   10575
   LinkTopic       =   "Form1"
   ScaleHeight     =   7320
   ScaleWidth      =   10575
   StartUpPosition =   3  'Windows Default
   Begin ComctlLib.Toolbar tooSerPreIcone 
      Align           =   1  'Align Top
      Height          =   660
      Left            =   0
      TabIndex        =   16
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
   Begin VB.Frame fraSerPreAluno 
      Caption         =   "Informações do Aluno"
      Height          =   2175
      Left            =   1080
      TabIndex        =   11
      Top             =   720
      Width           =   8295
      Begin VB.TextBox txtSerPreNome 
         Height          =   375
         Left            =   960
         TabIndex        =   13
         Top             =   600
         Width           =   4335
      End
      Begin VB.TextBox txtSerPreCPF 
         Height          =   405
         Left            =   960
         TabIndex        =   12
         Top             =   1320
         Width           =   2775
      End
      Begin VB.Label lblSerPreNome 
         Caption         =   "Nome"
         Height          =   255
         Left            =   360
         TabIndex        =   15
         Top             =   600
         Width           =   735
      End
      Begin VB.Label lblSerPreCPF 
         Caption         =   "CPF"
         Height          =   255
         Left            =   360
         TabIndex        =   14
         Top             =   1320
         Width           =   495
      End
   End
   Begin VB.Frame fraSerFeedBack 
      Caption         =   "FeedBack"
      Height          =   1335
      Left            =   3120
      TabIndex        =   5
      Top             =   5520
      Width           =   3975
      Begin VB.ComboBox comSerPreAluno 
         Height          =   315
         Left            =   1440
         TabIndex        =   7
         Top             =   600
         Width           =   1575
      End
      Begin VB.Label lblSerPreAluno 
         Caption         =   "Aluno"
         Height          =   255
         Left            =   360
         TabIndex        =   6
         Top             =   600
         Width           =   1095
      End
   End
   Begin VB.Frame fraSerPreServico 
      Caption         =   "Serviço"
      Height          =   2535
      Left            =   600
      TabIndex        =   0
      Top             =   3000
      Width           =   9495
      Begin VB.ComboBox comSerPreHora 
         Height          =   315
         Left            =   1440
         TabIndex        =   10
         Top             =   1800
         Width           =   2055
      End
      Begin VB.ComboBox comSerPreData 
         Height          =   315
         Left            =   1440
         TabIndex        =   9
         Top             =   1080
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
         Height          =   255
         Left            =   360
         TabIndex        =   4
         Top             =   1800
         Width           =   615
      End
      Begin VB.Label lblSerPreData 
         Caption         =   "Data"
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

Private Sub tooSerPreIcone_ButtonClick(ByVal Button As ComctlLib.Button)
Select Case Button.Index
        Case 1
            'Novo Arquivo
        Case 2
            'Abrir arquivo
        Case 3
            'Insert
        Case 4
            Unload frmSerPresencial
    End Select
End Sub

