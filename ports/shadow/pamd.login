#%PAM-1.0
auth		required	pam_securetty.so
auth		include		system-auth
account		required	pam_nologin.so
account		include		system-auth
password	include		system-auth
session		include		system-auth
session		optional	pam_env.so
