By default, Spring Security locks down everything. That means, if you run your app without any custom settings, every endpoint requires login, even /api/public.

To override this and allow some endpoints to be accessed freely while protecting others, we create a security configuration class. This class tells Spring Security:
✔ Which URLs should be open to everyone
✔ Which URLs should require login
✔ How users should log in (e.g., form-based login)
✔ How users should log out

🛠️ Summary
✔ By default, everything is locked 🔒
✔ We allow /api/public to be accessed freely 🟢
✔ We protect all other endpoints (/api/private) requiring login 🔑
✔ We enable a login page where users can sign in 📝
✔ We allow logout so users can log out 🚪

ENDPOINT:
- /api/public
- /api/private (requires authentication)
