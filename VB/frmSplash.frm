VERSION 5.00
Begin VB.Form frmSplash 
   BorderStyle     =   3  'Fixed Dialog
   ClientHeight    =   6315
   ClientLeft      =   255
   ClientTop       =   1410
   ClientWidth     =   10185
   ClipControls    =   0   'False
   ControlBox      =   0   'False
   Icon            =   "frmSplash.frx":0000
   KeyPreview      =   -1  'True
   LinkTopic       =   "Form2"
   MaxButton       =   0   'False
   MinButton       =   0   'False
   ScaleHeight     =   6315
   ScaleWidth      =   10185
   ShowInTaskbar   =   0   'False
   StartUpPosition =   2  'CenterScreen
   Begin VB.Frame frasiag 
      Height          =   6195
      Left            =   120
      TabIndex        =   0
      Top             =   60
      Width           =   9960
      Begin VB.TextBox txtSenha 
         Height          =   285
         Left            =   6720
         TabIndex        =   6
         Top             =   4080
         Width           =   2295
      End
      Begin VB.TextBox txtUsuario 
         Height          =   285
         Left            =   6720
         TabIndex        =   4
         Top             =   3240
         Width           =   2295
      End
      Begin VB.Timer TimerSplash 
         Interval        =   3000
         Left            =   9360
         Top             =   5640
      End
      Begin VB.Label lblSenha 
         Caption         =   "Senha:"
         Height          =   255
         Left            =   6120
         TabIndex        =   5
         Top             =   4080
         Width           =   615
      End
      Begin VB.Label lblUsuario 
         Caption         =   "Usuário"
         Height          =   255
         Left            =   6120
         TabIndex        =   3
         Top             =   3240
         Width           =   615
      End
      Begin VB.Label lblWarning 
         Caption         =   "Processando o Sistema..."
         BeginProperty Font 
            Name            =   "Arial"
            Size            =   8.25
            Charset         =   0
            Weight          =   400
            Underline       =   0   'False
            Italic          =   0   'False
            Strikethrough   =   0   'False
         EndProperty
         Height          =   195
         Left            =   150
         TabIndex        =   2
         Top             =   5820
         Width           =   6855
      End
      Begin VB.Label lblCompany 
         Caption         =   "Equipe A"
         BeginProperty Font 
            Name            =   "Arial"
            Size            =   8.25
            Charset         =   0
            Weight          =   400
            Underline       =   0   'False
            Italic          =   0   'False
            Strikethrough   =   0   'False
         EndProperty
         Height          =   255
         Left            =   8400
         TabIndex        =   1
         Top             =   4950
         Width           =   735
      End
      Begin VB.Image imgLogo 
         Height          =   3585
         Left            =   600
         Picture         =   "frmSplash.frx":000C
         Stretch         =   -1  'True
         Top             =   720
         Width           =   5415
      End
   End
End
Attribute VB_Name = "frmSplash"
Attribute VB_GlobalNameSpace = False
Attribute VB_Creatable = False
Attribute VB_PredeclaredId = True
Attribute VB_Exposed = False

Option Explicit

Private Sub Form_KeyPress(KeyAscii As Integer)
    Unload Me
End Sub

Private Sub Frame1_Click()
    Unload Me
End Sub

Private Sub Label1_Click()

End Sub

Private Sub TimerSplash_Timer()
    Unload Me
    frmSIAGAgendamento.Show
End Sub
