VERSION 5.00
Begin VB.Form frmSobre 
   Caption         =   "SIAG"
   ClientHeight    =   4140
   ClientLeft      =   120
   ClientTop       =   450
   ClientWidth     =   5865
   LinkTopic       =   "Form1"
   ScaleHeight     =   4140
   ScaleWidth      =   5865
   StartUpPosition =   3  'Windows Default
   Begin VB.Frame fraSobre 
      Caption         =   "Curiosidade"
      Height          =   3855
      Left            =   120
      TabIndex        =   0
      Top             =   120
      Width           =   5655
      Begin VB.Label lblInformações 
         Alignment       =   2  'Center
         BackStyle       =   0  'Transparent
         Caption         =   $"frmSobre.frx":0000
         BeginProperty Font 
            Name            =   "Cooper Black"
            Size            =   14.25
            Charset         =   0
            Weight          =   400
            Underline       =   0   'False
            Italic          =   -1  'True
            Strikethrough   =   0   'False
         EndProperty
         Height          =   3435
         Left            =   360
         TabIndex        =   1
         Top             =   360
         Width           =   4995
      End
   End
End
Attribute VB_Name = "frmSobre"
Attribute VB_GlobalNameSpace = False
Attribute VB_Creatable = False
Attribute VB_PredeclaredId = True
Attribute VB_Exposed = False
